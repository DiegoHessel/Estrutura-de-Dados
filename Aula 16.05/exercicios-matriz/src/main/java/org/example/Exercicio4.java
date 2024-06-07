package org.example;


import java.util.Scanner;

public class Exercicio4 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um número n (maior que 1 e menor que 6):");
            int n = leitor.nextInt();

            int[][] matriz = new int[n][n];
            System.out.println("Insira os valores para a matriz " + n + "x" + n + ":");
            for (int linha = 0; linha < n; linha++) {
                for (int coluna = 0; coluna < n; coluna++) {
                    matriz[linha][coluna] = leitor.nextInt();
                }
            }

            int somaDiagonalPrincipal = 0;
            int somaDiagonalSecundaria = 0;
            for (int i = 0; i < n; i++) {
                somaDiagonalPrincipal += matriz[i][i];
                somaDiagonalSecundaria += matriz[i][n - i - 1];
            }

            System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);
            System.out.println("A soma dos elementos da diagonal secundária é: " + somaDiagonalSecundaria);
        }
    }

