package com.agenda.contatos;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato){
        contatos.add(contato);

    }

    public void removerContato(String nome){
        for (Contato contato : contatos){
            if (contato.getNome().equalsIgnoreCase(nome)){
                contatos.remove(contato);
                System.out.println("Contato removido com sucesso");
                return;
            }
        }
    }

    public void exibirLista(){
        if (contatos.isEmpty()){
            System.out.println("A lista de contatos está vazia");
        }else{
            System.out.println("Lista de contatos :");
            for (Contato contato : contatos){
                System.out.println(contato);
            }
        }
    }
}
