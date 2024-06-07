package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void exibeMatriz(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz1 = new int[2][3];
        int[][] matriz2 = new int[2][3];
        int[][] matriz3 = new int[2][3];

        System.out.println("Insira os valores para a primeira matriz:");
        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
                matriz1[linha][coluna] = leitor.nextInt();
            }
        }

        System.out.println("Insira os valores para a segunda matriz:");
        for (int linha = 0; linha < matriz2.length; linha++) {
            for (int coluna = 0; coluna < matriz2[linha].length; coluna++) {
                matriz2[linha][coluna] = leitor.nextInt();
            }
        }

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
                matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }

        System.out.println("A soma das duas matrizes é:");
        exibeMatriz(matriz3);
    }
}