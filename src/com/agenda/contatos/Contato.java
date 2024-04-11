package com.agenda.contatos;

public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public String toString(){
        return "Nome: " + nome + ", Numero: " + numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
