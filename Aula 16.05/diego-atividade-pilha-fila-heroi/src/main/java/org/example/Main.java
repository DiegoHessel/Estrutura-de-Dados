package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1- Salvar objeto\n2- Deletar objeto\n3- Exibir\n4- Desfazer\n5- Agendar salvar\n6- Executar agendado\n7- Fim");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o ID do herói");
                    int id = scanner.nextInt();

                    if (id <100){
                        System.out.println("ID inválido");
                        break;
                    }else {
                        System.out.println("Digite o nome do herói");
                        String nome = scanner.next();
                        System.out.println("Digite a vida do herói");
                        int vida = scanner.nextInt();
                        System.out.println("Digite a força do herói");
                        double forca = scanner.nextDouble();
                        System.out.println("Digite a habilidade do herói");
                        String habilidade = scanner.next();
                        Heroi heroi = new Heroi(id, nome, vida, forca, habilidade);
                        repositorio.salvar(heroi);
                        break;
                    }
                case 2:
                    System.out.println("Digite o ID do herói a ser deletado");
                    id = scanner.nextInt();
                    repositorio.deletar(id);
                    break;
                case 3:
                    repositorio.exibir();
                    break;
                case 4:
                    repositorio.desfazer();
                    break;
                case 5:
                    System.out.println("Digite o ID do herói");
                    id = scanner.nextInt();
                    System.out.println("Digite o nome do herói");
                    String nome = scanner.next();
                    System.out.println("Digite a vida do herói");
                    int vida = scanner.nextInt();
                    System.out.println("Digite a força do herói");
                    double forca = scanner.nextDouble();
                    System.out.println("Digite a habilidade do herói");
                    String habilidade = scanner.next();
                    Heroi heroi = new Heroi(id, nome, vida, forca, habilidade);
                    repositorio.agendarSalvar(heroi);
                    break;
                case 6:
                    System.out.println("Digite a quantidade de operações agendadas a serem executadas");
                    int qtdOperacoes = scanner.nextInt();
                    repositorio.executarAgendado(qtdOperacoes);
                    break;
                case 7:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 7);
    }
}