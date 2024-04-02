package org.example;

public class Exercicio9 {
    public static String decimalParaBinario(int num) {
        String binario = "";
        while (num > 0) {
            binario = num % 2 + binario;
            num /= 2;
        }
        return binario;
    }
    public static String decimalParaBinarioRecursivo(int num) {
        if (num == 0) {
            return "0"; // Caso especial para o número 0
        }
        if (num == 1) {
            return "1"; // Caso especial para o número 1
        }
        return decimalParaBinarioRecursivo(num / 2) + num % 2;
    }
}
