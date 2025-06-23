package org.example;

public class Conta implements IConta{

    private int agencia;
    private int numeroConta;
    private int saldo;

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
