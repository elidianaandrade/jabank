package br.com.dio.jabank;

import br.com.dio.jabank.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<ContaCorrente> contasCorrente = new ArrayList<ContaCorrente>();

        Scanner entrada = new Scanner(System.in);
        boolean voltarMenu = false;

        System.out.println(String.format("\nJABANK ------------------------------------------------------------------->"));
        System.out.println(String.format("Olá! Bem-vindo(a) ao JaBank!"));
        System.out.println(String.format("Eu sou o Jabba, seu assistente virtual."));

        do {
            System.out.println("\nO que você deseja?");
            System.out.println(String.format("---------------------------------------"));
            System.out.println("1 | Criar uma conta");
            System.out.println("2 | Depositar");
            System.out.println("3 | Transferir");
            System.out.println("4 | Sacar");
            System.out.println("5 | Imprimir Extrato");

            System.out.print("\nDigite o número da sua opção: ");
            int numOpcao = Integer.parseInt(entrada.nextLine());
            System.out.println(String.format("\n"));

            switch (numOpcao) {
                case 1:
                    System.out.println("1 | CRIAR UMA CONTA -------------------------------------------------------\n");

                    Cliente cliente1 = new Cliente();
                    ContaCorrente contaCorrente1 = new ContaCorrente(cliente1);

                    System.out.println("Insira seus dados:");

                    System.out.print("Nome: ");
                    contaCorrente1.getCliente().setNome(entrada.nextLine());

                    System.out.print("Sobrenome: ");
                    contaCorrente1.getCliente().setSobrenome(entrada.nextLine());

                    System.out.print("CPF: ");
                    contaCorrente1.getCliente().setCpf(entrada.nextLine());

                    contasCorrente.add(contaCorrente1);

                    System.out.println(String.format("\nOlá " + cliente1.getNome() + ", obrigado por criar uma conta no JaBank!"));
                    System.out.println(String.format("Sua Agência é " + contaCorrente1.getAgencia() + ", Conta " + contaCorrente1.getNumero() + " e seu saldo de " + contaCorrente1.getSaldo() + " já está disponível para saque."));

                    break;

                case 2:
                    System.out.println("2 | DEPOSITAR -------------------------------------------------------------\n");
                    break;

                case 3:
                    System.out.println("3 | TRANSFERIR ------------------------------------------------------------\n");
                    break;

                case 4:
                    System.out.println("4 | SACAR -----------------------------------------------------------------\n");
                    break;

                case 5:
                    System.out.println("Imprimindo Extrato...\n");
                    break;

                default:
                    System.out.print("O número inserido é inválido! Favor inserir um número entre 1 e 5.");
                    break;
            }

            System.out.println(String.format("\n-------------------------------------------------------------------------->"));

            System.out.print("\nDeseja voltar ao menu principal? S / N: ");
            String resposta = entrada.nextLine().toLowerCase();
            if(resposta.equals("s")) voltarMenu = true;
            else {
                voltarMenu = false ;
                System.out.print("\nAtendimento finalizado.\n");
            }

        } while(voltarMenu == true);

        entrada.close();

    }

}
