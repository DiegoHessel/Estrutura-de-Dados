package org.example;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //criando um vetor para armazenar o número de dias de cada mês do ano
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dia, mes;
        int diaAno = 0;
        //solicitando que o usuário digite o dia e o mês
        System.out.println("Digite o dia (número de 1 a 31):");
        dia = new Scanner(System.in).nextInt();
        System.out.println("Digite o mês (número de 1 a 12):");
        mes = new Scanner(System.in).nextInt();
        //exibindo qual é esse dia no ano, considerando desde o início do ano
        for (int i = 0; i < mes - 1; i++) {
            diaAno += diasMes[i];
        }

        diaAno += dia;
        System.out.println("O dia " + dia + "/" + mes + " corresponde ao dia " + diaAno + " do ano.");

    }}