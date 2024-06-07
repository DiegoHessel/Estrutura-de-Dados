package org.example;

public class Main {
    public static void main(String[] args) {
        String[] heroes = {"Superman", "Batman", "Wonder Woman", "Flash", "Lanterna Verde", "Aquaman"};

        // Matriz de inteiros com pontuações dos heróis nos últimos dois anos
        int[][] pontuacao = {
                {85, 90},
                {80, 95},
                {90, 92},
                {88, 89},
                {92, 94},
                {87, 91}
        };
        double[] divisaoColuna = new double[2];
        double[] somaColuna = new double[2];
        double[] divisaoLinha = new double[heroes.length];
        double[] somaLinha = new double[heroes.length];

        // Calculando a soma das colunas e das linhas
        for (int i = 0; i < pontuacao.length; i++) {
            for (int j = 0; j < pontuacao[i].length; j++) {
                somaColuna[j] += pontuacao[i][j];
                somaLinha[i] += pontuacao[i][j];
            }
        }
        for (int i = 0; i < pontuacao.length; i++) {
            for (int j = 0; j < pontuacao[i].length; j++) {
                divisaoColuna[j] = somaColuna[j] / heroes.length;
                divisaoLinha[i] = somaLinha[i] / heroes.length;
            }
        }

        // Exibindo o relatório

        System.out.printf("%-20s %10s %10s %10s %10s%n", "Hero", "Ano 1", "Ano 2", "Total", "Média");
        for (int i = 0; i < heroes.length; i++) {
            System.out.printf("%-20s %10d %10d %10.2f %10.2f%n", heroes[i], pontuacao[i][0], pontuacao[i][1], somaLinha[i], divisaoLinha[i]);
        }

        System.out.printf("%-20s %10.2f %10.2f%n", "Soma por coluna ", somaColuna[0], somaColuna[1]);
        System.out.printf("%-20s %10.2f %10.2f%n", "Media por coluna", divisaoColuna[0], divisaoColuna[1]);
    }
}