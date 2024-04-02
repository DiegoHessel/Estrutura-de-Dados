package org.example;

import java.util.Scanner;

public class Exercicio4 {
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
        // Criando um vetor com 10 posições
        int[] vetor4 = new int[10];
        Scanner leitor = new Scanner(System.in);

        //preenchendo o vetor com valores digitado
        leVetor(vetor4);

        //exibindo um vetor
        System.out.println("Vetor 4:");
        exibeVetor(vetor4);

        //pesquisando um numero no vetor
        System.out.println("Digite um número para pesquisar no vetor:");
        int numero = leitor.nextInt();
        int contador = 0;
        for (int i = 0; i < vetor4.length; i++) {
            if (vetor4[i] == numero) {
                contador++;
            }
        }
        System.out.println("O número " + numero + " ocorre " + contador + " vezes");
    }
}
