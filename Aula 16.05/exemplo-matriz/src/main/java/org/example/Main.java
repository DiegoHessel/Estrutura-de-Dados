package org.example;

import java.util.Scanner;

public class Main {
    public static void exibeMatriz(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
    // metodo para exibir a matriz transposta ou matriz invertida
    public static void exibeMatrizTransposta(int[][] matriz) {
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // criacao de um obj scanner
        Scanner leitor = new Scanner(System.in);

        // declaracao e criacao de vetor
        int[] vetor = new int[10];

        // declaracao e criacao de matriz 3x4
        int[][] matriz = new int[3][4];

        // declaracao e criacao de matriz irregular
        int[][] matrizLoka = {
                {1}, {2, 3, 4}, {5, 6},
                {7, 8, 9, 10}
        };

        // declaracao e criacao de matriz inicializada com valores
        int[][] matriz2 = {
                {1, 2}, {3, 4}, {5, 6}, {7, 8}
        };
        // declaracao e criacao de outra matriz iregular
        int[][] matrizLoka2 = new int[4][];{
            matrizLoka2[0] = new int[5];
            matrizLoka2[1] = new int[7];
            matrizLoka2[2] = new int[3];
            matrizLoka2[3] = new int[1];
        };

        //solicitacao de dados ao usuario para preencher a matriz

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da matriz [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = leitor.nextInt();
            }

        }
        // exibicao da matriz no formato de matriz
        System.out.println("Exibindo a matriz: ");
        exibeMatriz(matriz);
        System.out.println("Exibindo a matriz2: ");
        exibeMatriz(matriz2);
        System.out.println("Exibindo a matrizLoka: ");
        exibeMatriz(matrizLoka);
        // exibicao da matriz transposta
        System.out.println("Exibindo a matriz transposta: ");
        exibeMatrizTransposta(matriz);
        System.out.println("Exibindo a matriz2 transposta: ");
        exibeMatrizTransposta(matriz2);

    }
}