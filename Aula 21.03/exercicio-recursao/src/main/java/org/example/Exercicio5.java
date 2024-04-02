package org.example;

public class Exercicio5 {
    public static void qtdDeVezesQueApareceNoVetor(int[] v, int i, int n) {
        int qtd = 0;
        if (i < v.length) {
            for (int j = 0; j < v.length; j++) {
                if (v[j] == n) {
                    qtd++;
                }
            }
            System.out.println(qtd);
        }
    }

    public static int qtdDeVezesQueApareceNoVetorRecursivo(int[] v, int i, int n) {
        if (i >= v.length) {
            return 0;
        } else {
            if (v[i] == n) {
                return 1 + qtdDeVezesQueApareceNoVetorRecursivo(v, i + 1, n);
            } else {
                return qtdDeVezesQueApareceNoVetorRecursivo(v, i + 1, n);
            }
      }
    }
}