package org.example;

public class Exercicio2 {
    public static void somaDeVetor(int[]v,int i){
        if (i< v.length){
            int soma = 0;
            for (int j = 0; j < v.length; j++) {
                soma += v[j];
          }
            System.out.println(soma);
        }
    }
    public static int somaDeVetorRecursivo(int[]v,int i){
        if (i >= v.length) {
            return 0;
        } else {

            return v[i] + somaDeVetorRecursivo(v, i + 1);
        }
    }
}
