package org.example;

import java.util.Scanner;

public class Exercicio8 {
    public static void somaDeUmNumeroDigitado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numrtoDigitado = scanner.nextInt();

        int soma = 0;
        int temp = numrtoDigitado;
        while (temp != 0) {
            soma += temp % 10;
            temp /= 10;
        }
        System.out.println(soma);
    }

    public static int somaDeUmNumeroDigitadoScannerRecursivo(int num)
    {
        if (num == 0) {
            return 0;
        } else {
            int digito = num % 10;
            return digito +somaDeUmNumeroDigitadoScannerRecursivo(num / 10);
        }
    }

    public static int somaDeUmNumeroDigitadoRecursivo(int n) {
        if (n == 0) {
            return (0);
        } else {
            return (n % 10 + somaDeUmNumeroDigitadoRecursivo(n / 10));
        }
    }
}
