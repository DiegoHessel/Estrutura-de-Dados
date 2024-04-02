package org.example;

import java.util.Scanner;

public class Exercicio5 {
    public static void exibeVetor(String[] v) {
        //Exibindo o vetor
        for (int i = 0; i < v.length; i++) {
            System.out.println("Vetor [" + i + "] " + v[i]);
        }
    }

    public static void leVetor(String[] v) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite o Nome do carro[" + i + "]");
            v[i] = leitor.next();
        }
    }

    public static void leVetorRendimento(int[] v) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite o Rendimento do carro[" + i + "]");
            v[i] = leitor.nextInt();
        }
    }

    public static void exibeVetorRendimento(int[] v) {
        //Exibindo o vetor
        for (int i = 0; i < v.length; i++) {
            System.out.println("Vetor [" + i + "] " + v[i]);
        }
    }

    public static void main(String[] args) {

        // criando um vetor para armazenar 5 Strings
        String[] modelos = new String[5];

        // criando um vetor para armazenar 5 inteiros
        int[] rendimento = new int[5];

        Scanner leitor = new Scanner(System.in);
        //preenchendo o vetor com valores digitado
        leVetor(modelos);
        //exibindo um vetor
        System.out.println("Modelos:");
        exibeVetor(modelos);

        //preenchendo o vetor com valores de rendimento do carro
        leVetorRendimento(rendimento);
        //exibindo um vetor
        System.out.println("Rendimento:");
        exibeVetorRendimento(rendimento);

        // procurando o carro mais econômico com base no rendimento
        int menorRendimento = rendimento[0];
        int indice = 0;
        for (int i = 0; i < rendimento.length; i++) {
            if (rendimento[i] > menorRendimento) {
                menorRendimento = rendimento[i];
                indice = i;
            }
        }
        System.out.println("O carro mais econômico é o " + modelos[indice] + " com " + menorRendimento + " km/l");
    }
}