package org.example;



import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] vetor = new int[3];

        System.out.println("Insira os valores para a matriz 3x3:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = leitor.nextInt();
            }
        }

        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                vetor[coluna] += matriz[linha][coluna];
            }
        }

        System.out.println("O vetor contendo os totais de cada coluna é:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}