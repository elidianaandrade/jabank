package br.com.dio.jabank.models;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;

    public Cliente(){ }

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNome(){
            return nome;
    }

    public void setNome(String nome){
            this.nome = nome;
    }

    public String getSobrenome() {
            return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf(){
            return cpf;
    }

    public void setCpf(String cpf){
            this.cpf = cpf;
    }


}
