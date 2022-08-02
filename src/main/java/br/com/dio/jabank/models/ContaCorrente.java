package br.com.dio.jabank.models;

public class ContaCorrente extends Conta {

        public ContaCorrente(Cliente cliente) {
                super(cliente);
        }

        @Override
        public void imprimirExtrato() {
                super.imprimirDados();
                System.out.println(String.format("\nCONTA CORRENTE"));
                super.imprimirSaldo();
        }

}