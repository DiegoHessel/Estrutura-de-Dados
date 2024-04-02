package org.example;

import java.util.Scanner;

import static org.example.Exercicio9.decimalParaBinario;

public class Main {


    public static void main(String[] args) {
//        System.out.println("Exercicio 1");
//        Exercicio1.somaDosNumeros(2);
//        System.out.println("-----------\n");
//        System.out.println(Exercicio1.somaDosNumerosRecursivo(2));
//
//
//        System.out.println("-----------\nExercicio 2");
//        Exercicio2.somaDeVetor(new int[]{1, 20, 9, 0, 5}, 0);
//        System.out.println("-----------");
//        System.out.println(Exercicio2.somaDeVetorRecursivo(new int[]{1, 4, 5, 8, 7, 8, 2, 7, 7, 3}, 0));
//
//
//        System.out.println("-----------\nExercicio 3");
//        Exercicio3.somaDeNumerosParesNoVetor(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0);
//        System.out.println("-----------");
//        System.out.println(Exercicio3.somaDeNumerosParesNoVetorRecursivo(new int[]{5, 5, 4, 6, 46, 4, 4, 7, 0}, 0));
//
//
//        System.out.println("-----------\nExercicio 4");
//        Exercicio4.somaDeNumerosImparesNoVetor(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0);
//        System.out.println("-----------");
//        System.out.println(Exercicio4.somaDeNumerosImparesNoVetorRecursivo(new int[]{5, 5, 4, 6, 46, 4, 4, 7, 0}, 0));
//
//
//        System.out.println("-----------\nExercicio 5");
//        Exercicio5.qtdDeVezesQueApareceNoVetor(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0, 5);
//        System.out.println("-----------");
//        System.out.println(Exercicio5.qtdDeVezesQueApareceNoVetorRecursivo(new int[]{5, 5, 4, 6, 46, 4, 4, 7, 0}, 0, 5));
//
//
//        System.out.println("-----------\nExercicio 6");
//        Exercicio6.algoritimoDeEuclides(90, 54);
//        System.out.println("-----------");
//        Exercicio6.algoritimoDeEuclidesRecursivo(90, 54);
//
//
//        System.out.println("-----------\nExercicio 7");
//        Exercicio7.maiorNumeroDoVetor(new int[]{11,22, 3, 4, 5, 6, 7, 8, 9, 1}, 0);
//        System.out.println("-----------");
//        Exercicio7.maiorNumeroDoVetorRecursivo(new int[]{11,22, 13, 34, 54, 65, 76, 10}, 0);
//
//
//        System.out.println("-----------\nExercicio 8");
//        Exercicio8.somaDeUmNumeroDigitado();
//        System.out.println("-----------");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um número: ");
//        int numertoDigitado = scanner.nextInt();
//        int soma = Exercicio8.somaDeUmNumeroDigitadoScannerRecursivo(numertoDigitado);
//
//        System.out.println("A soma dos dígitos de " + numertoDigitado + " é: " + soma);
//
//        //System.out.println(Exercicio8.somaDeUmNumeroDigitadoRecursivo(123));
//
        System.out.println("-----------\nExercicio 9");

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner2.nextInt();


        String binario = decimalParaBinario(numero);
        System.out.println("Representação binária de " + numero + " é " + binario);
        System.out.println("-----------");
        System.out.println("Representação binária de " + numero + " é " + Exercicio9.decimalParaBinarioRecursivo(numero));
    }

    }

