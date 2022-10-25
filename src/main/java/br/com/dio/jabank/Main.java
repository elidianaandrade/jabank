package br.com.dio.jabank;

import br.com.dio.jabank.models.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean escolha = false;

        System.out.println(String.format("\nJABANK ---------------------------------->"));
        System.out.println(String.format("Olá! Bem-vindo(a) ao JaBank!"));
        System.out.println(String.format("Eu sou o Jabba, seu assistente virtual.\n"));

        System.out.print("O que você deseja?\n");
        System.out.println(String.format("--------------------------------"));
        System.out.print("1 | Criar uma conta \n");
        System.out.print("2 | Depositar \n");
        System.out.print("3 | Transferir \n");
        System.out.print("4 | Sacar \n");
        System.out.print("5 | Imprimir Extrato \n");

        System.out.print("\nDigite o número da sua opção: ");
        int numOpcao = entrada.nextInt();
        System.out.println(String.format("--------------------------------\n"));

        switch (numOpcao) {
            case 1:
                System.out.println("1 | CRIAR UMA CONTA ------------");
                break;

            case 2:
                System.out.println("2 | DEPOSITAR ------------------");
                break;

            case 3:
                System.out.println("3 | TRANSFERIR -----------------");
                break;

            case 4:
                System.out.println("4 | SACAR ----------------------");
                break;

            case 5:
                System.out.println(String.format("\n-------------------------------"));
                System.out.println("\nImprimindo Extrato...");
                break;

            default:
                System.out.println("\nO número inserido é inválido! Favor inserir um número entre 1 e 5.");
                break;
        }

        System.out.println(String.format("\n----------------------------------------->"));

        entrada.close();
        
    }

}
