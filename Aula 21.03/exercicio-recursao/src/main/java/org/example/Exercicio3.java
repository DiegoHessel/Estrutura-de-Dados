package org.example;

public class Exercicio3 {
    public static void somaDeNumerosParesNoVetor(int[] v, int i) {
        int soma = 0;
        if (i < v.length) {
            for (int j = 0; j < v.length; j++) {
                if (v[j] % 2 == 0) {
                    //System.out.println(v[j]+" é par");
                    soma += v[j];
                }
            }
            System.out.println(soma);
        }
    }

    public static int somaDeNumerosParesNoVetorRecursivo(int[] v, int i) {
        if (i >= v.length) {
            return 0;
        } else {
            if (v[i] % 2 == 0) {
               // System.out.println(v[i]);
                return v[i] + somaDeNumerosParesNoVetorRecursivo(v, i + 1);
            } else {
                return somaDeNumerosParesNoVetorRecursivo(v, i + 1);
            }
        }

    }
}
