package org.example;

import lombok.Getter;

@Getter
public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    private boolean bloqueada;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumeroConta()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void pagarBoleto(double valor) {
        if (valor > 0 && saldo >= valor) {
            sacar(valor);
            System.out.println("Boleto pago com sucesso! Valor: " + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void bloquearConta() {
        bloqueada = true;
        System.out.println("Conta bloqueada.");
    }

    public void desbloquearConta() {
        bloqueada = false;
        System.out.println("Conta desbloqueada.");
    }



}
