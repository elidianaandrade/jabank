package br.com.dio.jabank;

import br.com.dio.jabank.models.*;

public class Main {

    public static void main(String[] args) {
        Cliente elidiana = new Cliente();
        elidiana.setNome("Elidiana");
        elidiana.setSobrenome("Andrade");

        Conta corrente = new ContaCorrente(elidiana);
        Conta poupanca = new ContaPoupanca(elidiana);

        corrente.depositar(230);
        corrente.transferir(0, poupanca);
        corrente.sacar(80);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
