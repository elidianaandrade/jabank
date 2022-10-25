package br.com.dio.jabank.models;

import br.com.dio.jabank.interfaces.IConta;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int COUNTER = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = COUNTER++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
            if(valor > 0 && this.getSaldo() >= valor) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Prezado cliente, não foi possível realizar o saque. " +
                        "Por favor, tente novamente ou entre em contato com a Agência ou com a Central de Atendimento JaBank.");
            }
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Prezado cliente, não foi possível realizar o depósito. " +
            "Por favor, tente novamente ou entre em contato com a Agência ou com a Central de Atendimento JaBank.");
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if(valor > 0 && this.getSaldo() >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Prezado cliente, não foi possível realizar a transferência. " +
                    "Por favor, tente novamente ou entre em contato com a Agência ou com a Central de Atendimento JaBank.");
        }

    }

    public int getAgencia() {
            return agencia;
    }

    public int getNumero() {
            return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
            return saldo;
    }

    protected void imprimirDados() {
        System.out.println(String.format("\n--------------------------------------------"));
        System.out.println(String.format("\nAGÊNCIA: %d", this.agencia));
        System.out.println(String.format("CONTA: %d", this.numero));
        System.out.println(String.format("CLIENTE: %s", this.cliente.getNome() + " " + this.cliente.getSobrenome()));
        System.out.println(String.format("\n----- EXTRATO PARA SIMPLES CONFERÊNCIA -----"));
    }
    protected void imprimirSaldo() {
        System.out.println(String.format("SALDO: %.2f", this.saldo));
        System.out.println(String.format("\n--------------------------------------------\n"));
    }

}
