package org.example;

public class Exercicio4 {
   public static void somaDeNumerosImparesNoVetor(int[] v, int i) {
       int soma = 0;
       if (i < v.length) {
           for (int j = 0; j < v.length; j++) {
               if (v[j] % 2 == 1) {
                   //System.out.println(v[j]+" é impar");
                   soma += v[j];
               }
           }
           System.out.println(soma);
       }
   }

    public static int somaDeNumerosImparesNoVetorRecursivo(int[] v, int i) {
        if (i >= v.length) {
            return 0;
        } else {
            if (v[i] % 2 == 1) {
                //System.out.println(v[i] + " é impar");
                   return v[i] + somaDeNumerosImparesNoVetorRecursivo(v, i + 1);
            } else {
                return somaDeNumerosImparesNoVetorRecursivo(v, i + 1);
            }
        }

    }
}