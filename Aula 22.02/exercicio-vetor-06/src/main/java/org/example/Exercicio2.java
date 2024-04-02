package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void exibirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("Vetor[" + i + "]" + v[i]);
        }
    }

    public static void leVetor(int[] v) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite o valor de vetor[" + i + "]");
            v[i] = leitor.nextInt();
        }
    }

    public static void main(String[] args) {

        // Criando um vetor com 10 posições
        int[] vetor2 = new int[10];
        int soma = 0;
        double media = 0;
        //preenchendo o vetor com valores digitado
        leVetor(vetor2);
        //exibindo um vetor
        System.out.println("Vetor 2:");
        exibirVetor(vetor2);
        //calculando a média
        for (int i = 0; i < vetor2.length; i++) {
            soma += vetor2[i];

        }
        media = (double) soma / vetor2.length;
        System.out.println("Média: " + media);
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor2[i] > media) {
                System.out.println("Vetor[" + i + "]" + vetor2[i]);
            }
        }
    }
}
