package com.agenda.contatos;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();


        while (true){
            System.out.println("----Agenda de contatos-----");
            System.out.println("1 - Criar novo contato");
            System.out.println("2 - Remover contato da lista de contatos ");
            System.out.println("3 - Exibir lista de contatos");
            System.out.println("4 - Exit");

            System.out.println("Escolha uma opção: ");
            int entrada = scanner.nextInt();
            scanner.nextLine();

            if (entrada == 1){
                System.out.println("Nome do contato: ");
                String nome = scanner.nextLine();

                System.out.println("Numero de telefone do contato: ");
                String numero = scanner.nextLine();

                Contato novoContato = new Contato(nome, numero);


                agenda.adicionarContato(novoContato);
                System.out.println("Contato criado com sucesso!!!\n");

            } else if (entrada == 2) {
                System.out.println("Digite o nome do contato que deseja remover: ");
                String nome = scanner.nextLine();

                agenda.removerContato(nome);

            } else if (entrada == 3) {

                agenda.exibirLista();

            }else if (entrada == 4){
                System.out.println("Encerrando a agenda de contatos");
                break;
            }

        }
        scanner.close();
    }
}
