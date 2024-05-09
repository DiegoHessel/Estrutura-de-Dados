package org.example;

import java.util.Arrays;

import static org.example.PilhaObj.inverteString;

public class Main {


    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        System.out.println(pilha.isEmpty());
        System.out.println(pilha.isFull());
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        System.out.println(pilha.isEmpty());
        System.out.println(pilha.isFull());
        ehPalindromo(new int[]{1, 2, 3, 2, 1});
        converteParaBinario(13);
        System.out.println("--------------------------------------");
        System.out.println("PilhaObj");
        PilhaObj<Integer> pilhaObj = new PilhaObj<>(5);
        pilhaObj.push(1);
        pilhaObj.push(2);
        pilhaObj.push(3);
        pilhaObj.push(4);
        System.out.println(pilhaObj.isEmpty());
        System.out.println(pilhaObj.isFull());
        System.out.println(pilhaObj.pop());
        System.out.println(pilhaObj.pop());
        pilhaObj.exibe();
        System.out.println(pilhaObj.peek());

        System.out.println("--------------------------------------");
        System.out.println("ListaObj Lendo string invertida");
        inverteString("O diego é legal");
        System.out.println("--------------------------------------");

        System.out.println(ehPalindromo("radar")); // true
        System.out.println(ehPalindromo("ovo")); // true
        System.out.println(ehPalindromo("Ana")); // true
        System.out.println(ehPalindromo("subi no ônibus")); // true
        System.out.println(ehPalindromo("Socorram-me subi no ônibus em Marrocos")); // true
        System.out.println(ehPalindromo("anotaram a data da maratona")); // true
        System.out.println(ehPalindromo("a torre da derrota")); // true

    }

    public static boolean ehPalindromo(String texto) {
        texto = texto.toLowerCase().replace(" ", "");
        PilhaObj<Character> pilha = new PilhaObj<>(texto.length());
        for (int i = 0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != pilha.pop()) {
                System.out.println(texto);
                System.out.println("não é palindromo");
                return false;
            }

        }
        System.out.println(texto);
        System.out.println("é palindromo");
        return true;
    }

    public static boolean ehPalindromo(int[] vetor) {
        Pilha pilha = new Pilha(vetor.length);
        for (int i = 0; i < vetor.length; i++) {
            pilha.push(vetor[i]);
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != pilha.pop()) {
                System.out.println(Arrays.toString(vetor));
                System.out.println("não é palindromo");
                return false;
            }

        }
        System.out.println(Arrays.toString(vetor));
        System.out.println("é palindromo");
        return true;
    }

    public static void converteParaBinario(int numero) {
        Pilha pilha = new Pilha((int) (Math.log(numero) / Math.log(2)) + 1);

        while (numero > 0) {
            pilha.push(numero % 2);
            numero = numero / 2;
        }
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }

    }


}