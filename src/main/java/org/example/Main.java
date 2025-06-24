package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente luan = new Cliente();
        luan.setNome("Luan");

        Conta cc = new ContaCorrente(luan);
        Conta cp = new ContaPoupanca(luan);

        cc.depositar(150);
        cc.transferir(75, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}