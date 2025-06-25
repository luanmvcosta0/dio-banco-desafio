package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente luan = new Cliente();
        luan.setNome("Luan");

        Conta cc = new ContaCorrente(luan);
        Conta cp = new ContaPoupanca(luan);

        cc.depositar(200);
        cc.transferir(70, cp);

        System.out.println("=========================");

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println("=========================");

        cc.consultarSaldo();
        cp.consultarSaldo();

        System.out.println("=========================");

        cc.pagarBoleto(95);

        System.out.println("=========================");

        cp.bloquearConta();
        cp.desbloquearConta();

        System.out.println("=========================");

        cc.encerrarConta();
        cp.encerrarConta();

    }
}