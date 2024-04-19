package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaObj<Heroi> lista = new ListaObj<>(5);
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n1 - Adicionar herói");
            System.out.println("2 - Listar heróis");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Digite o ID do herói: ");
                    int id = scanner.nextInt();
                    System.out.print("Digite o nome do herói: ");
                    String name = scanner.next();
                    System.out.print("Digite o poder do herói: ");
                    double power = scanner.nextDouble();
                    System.out.print("Digite a idade do herói: ");
                    int age = scanner.nextInt();
                    System.out.print("Digite a força do herói: ");
                    double force = scanner.nextDouble();
                    System.out.print("Digite a habilidade do herói: ");
                    String ability = scanner.next();
                    System.out.print("Digite o esquadrão do herói: ");
                    String squad = scanner.next();
                    Heroi heroi = new Heroi(id, name, power, age, force, ability, squad);
                    lista.adiciona(heroi);
                    break;
                case 2:
                    System.out.printf("%10s %-10s %10s %10s %10s %-30s %-30s\n", "ID", "Nome", "Poder", "Idade", "Força", "Habilidade", "Esquadrão");
                    for (int i = 0; i < lista.getTamanho(); i++) {
                        Heroi h = lista.getElemento(i);
                        System.out.printf("%10d %-10.10s %-10.2f %10d %10.2f %-10.10s %-10.10s\n", h.getId(), h.getNome(), h.getPoder(), h.getIdade(), h.getForca(), h.getHabilidade(), h.getSquad());
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (option != 3);

        scanner.close();
    }
}