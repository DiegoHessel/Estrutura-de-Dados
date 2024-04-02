package org.example;

import java.util.Scanner;

public class Exercicio1 {
    public static void exibeVetor(int[] v) {
        //Exibindo o vetor
        for (int i = 0; i < v.length; i++) {
            System.out.println("Vetor [" + i + "] " + v[i]);
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
        // Criando um vetor com 7 posições
        int[] vetor1 = new int[7];

        //preenchendo o vetor com valores digitado
        leVetor(vetor1);

        // exibindo um vetor
        System.out.println("Vetor 1:");
        exibeVetor(vetor1);

    //exibindo o vetor de trás para frente
        System.out.println("Vetor 1 de trás para frente:");

        for (int i = vetor1.length - 1; i >= 0; i--) {
            System.out.println("Vetor [" + i + "] " + vetor1[i]);
        }
    }

}