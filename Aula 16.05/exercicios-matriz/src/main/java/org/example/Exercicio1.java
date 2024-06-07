package org.example;

import java.util.Scanner;

public class Exercicio1 {
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
        int[][] matriz = new int[2][3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da matriz [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = leitor.nextInt();
            }
        }

        System.out.println("Exibindo a matriz 2x3: ");
        exibeMatriz(matriz);
    }
}