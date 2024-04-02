package org.example;

import java.util.Scanner;

public class Exercicio3 {
    public static void exibeVetor(String[] v) {
        //Exibindo o vetor
        for (int i = 0; i < v.length; i++) {
            System.out.println("Vetor [" + i + "] " + v[i]);
        }
    }

    public static void leVetor(String[] v) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite o Nome do vetor[" + i + "]");
            v[i] = leitor.next();
        }
    }

    public static void pesquisarNome(String[] v, String nome) {
        boolean achou = false;
        for (int i = 0; i < v.length; i++) {
            if (v[i].equals(nome)) {
                System.out.println("Nome encontrado no índice " + i);
                achou = true;
            } else if (i == v.length - 1 && !achou) {
                System.out.println("Nome não encontrado");
            }
        }
    }

    public static void main(String[] args) {

        // criando um vetor para armazenar 10 Strings
        String[] vetor3 = new String[10];
        Scanner leitor = new Scanner(System.in);
        //preenchendo o vetor com valores digitado
        leVetor(vetor3);
        //exibindo um vetor
        System.out.println("Vetor 3:");
        exibeVetor(vetor3);
        //pesquisando um nome no vetor
        System.out.println("Digite um nome para pesquisar no vetor:");
        String nome = leitor.next();
        pesquisarNome(vetor3, nome);
    }
}