package org.example;

public class Exercicio7 {
    public static void maiorNumeroDoVetor(int[] vetor, int i) {

        int maior = vetor[i];
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] > maior) {
                maior = vetor[j];
            }
        }
        System.out.println(maior);
    }

    public static void maiorNumeroDoVetorRecursivo(int[] vetor, int i) {
        if (i == vetor.length - 1) {
            System.out.println(vetor[i]);
        } else {

            if (vetor[i] > vetor[i + 1]) {
                vetor[i + 1] = vetor[i];
            }
            maiorNumeroDoVetorRecursivo(vetor, i + 1);
        }
    }
}
