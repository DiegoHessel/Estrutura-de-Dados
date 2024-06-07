package org.example;

import java.util.Scanner;

public class Exercicio5 {
    public static boolean quadradoMagico(int[][] matriz) {
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][matriz.length - i - 1];
        }
        if (somaDiagonalPrincipal != somaDiagonalSecundaria) {
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            if (somaLinha != somaDiagonalPrincipal || somaColuna != somaDiagonalPrincipal) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Insira os valores para a matriz 3x3:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = leitor.nextInt();
            }
        }

        if (quadradoMagico(matriz)) {
            System.out.println("A matriz é um quadrado mágico.");
        } else {
            System.out.println("A matriz não é um quadrado mágico.");
        }
    }
}