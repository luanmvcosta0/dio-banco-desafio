package org.example;

public class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numeroConta;
    private int saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

}
