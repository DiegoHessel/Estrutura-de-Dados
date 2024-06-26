package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploThrows {
    public static int divide(int a ,int b) throws ArithmeticException{
        return a/b;

   }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.printf("digite um numero");
            int numerador = leitor.nextInt();
            System.out.printf("digite um numero");
            int denominador = leitor.nextInt();
            System.out.println(numerador + "/" + denominador + "=" + divide(numerador,denominador));
        }
        catch (ArithmeticException erro){
            System.out.println("Divisão por Zero");
        erro.printStackTrace();
        }
        catch (InputMismatchException erro){
            System.out.println("Digite apenas números");
            erro.printStackTrace();
        }
    }
}
