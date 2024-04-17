package org.example;

public class Main {
    public static void main(String[] args){
        int ra1 =50000;
        int ra2 =50001;
        String nome1 = "Maria";
        String nome2 = "Jose";
        double nota1 =9.0;
        double nota2 =7.5;
        System.out.printf("----------------------------------------------------------\n");
        System.out.printf("%7S %-10S %7S \n","ra","nome","nota");
        System.out.printf("%7d %-10s %7.2f \n",ra1,nome1,nota1);
        System.out.printf("%7d %-10s %7.2f \n",ra2,nome2,nota2);

    }
}