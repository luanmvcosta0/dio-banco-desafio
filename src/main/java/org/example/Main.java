package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente luan = new Cliente();
        luan.setNome("Luan");

        Conta cc = new ContaCorrente(luan);
        Conta cp = new ContaPoupanca(luan);

        cc.depositar(200);
        cc.transferir(70, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.consultarSaldo();
        cp.consultarSaldo();

        cc.pagarBoleto(95);

        cp.bloquearConta();
        cp.desbloquearConta();

    }
}