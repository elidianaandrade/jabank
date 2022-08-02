package br.com.dio.jabank.models;

public class ContaUniversitaria extends Conta {

        public ContaUniversitaria(Cliente cliente) {
            super(cliente);
        }

        @Override
        public void imprimirExtrato() {
                super.imprimirDados();
                System.out.println(String.format("\nCONTA UNIVERSITÁRIA"));
                super.imprimirSaldo();
        }

}
