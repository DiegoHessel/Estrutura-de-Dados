package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] turmaT1 = new String[10];
        String[] turmaT2 = new String[10];
        int countT1 = 0;
        int countT2 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();
            System.out.println("Digite a turma do aluno (T1 ou T2):");
            String turma = scanner.nextLine();

            if ("T1".equals(turma) || "t1".equals(turma)) {
                turmaT1[countT1] = nome;
                countT1++;
            } else if ("T2".equals(turma) || "t2".equals(turma)) {
                turmaT2[countT2] = nome;
                countT2++;
            }
        }

        System.out.println("Quantidade de alunos na turma T1: " + countT1);
        for (int i = 0; i < countT1; i++) {
            System.out.println(turmaT1[i]);
        }

        System.out.println("Quantidade de alunos na turma T2: " + countT2);
        for (int i = 0; i < countT2; i++) {
            System.out.println(turmaT2[i]);
        }
    }
}