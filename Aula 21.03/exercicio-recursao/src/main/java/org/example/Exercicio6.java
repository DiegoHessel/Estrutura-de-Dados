package org.example;

public class Exercicio6 {
    public static void algoritimoDeEuclides(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        System.out.println(a + b);
    }
    public static void algoritimoDeEuclidesRecursivo(int a, int b) {
        if (a == 0) {
            System.out.println(b);
        } else if (b == 0) {
            System.out.println(a);
        } else {
            if (a > b) {
                algoritimoDeEuclidesRecursivo(a % b, b);
            } else {
                algoritimoDeEuclidesRecursivo(a, b % a);
            }
        }
    }
}
