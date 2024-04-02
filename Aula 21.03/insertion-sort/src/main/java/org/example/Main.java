package org.example;

public class Main {
    public static void insertionSort(int[] v) {
        int j, x;
        int comparacao = 0;
        int troca = 0;
        for (int i = 1; i < v.length; i++) {
            x = v[i];
            j = i - 1;
            comparacao++;
            while (j >= 0 && v[j] > x) {
                v[j + 1] = v[j];
                j--;
                troca++;

            }

            v[j + 1] = x;

        }
        System.out.println("Comparações feitas " + comparacao);
        System.out.println("Trocas feitas " + troca);
    }

    public static void main(String[] args) {
        int[] v = {5, 2, 4, 6, 1, 3};
        insertionSort(v);
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");

        }
        System.out.println();
    }
}