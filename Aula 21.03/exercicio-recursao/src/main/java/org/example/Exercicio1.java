package org.example;

public class Exercicio1 {
    public static void somaDosNumeros(int n) {
        if (n >= 0) {
            int soma = 0;
            for (int i = 0; i <= n; i++) {
                soma += i;
            }
            System.out.println(soma);
        }
    }
    public static int somaDosNumerosRecursivo(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + somaDosNumerosRecursivo(n - 1);
        }
    }
}
