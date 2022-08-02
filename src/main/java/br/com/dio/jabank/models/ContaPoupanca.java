package br.com.dio.jabank.models;

public class ContaPoupanca extends Conta {

        public ContaPoupanca(Cliente cliente) {
            super(cliente);
        }

        @Override
        public void imprimirExtrato() {
                super.imprimirDados();
                System.out.println(String.format("\nCONTA POUPANÇA"));
                super.imprimirSaldo();
        }

}