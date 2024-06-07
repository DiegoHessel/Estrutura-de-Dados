package org.example;


    //Escreva o código para:
    //- Solicitar que o usuário digite o valor maxAluno, que deverá ser um número inteiro maior ou
    //igual a 5 e menor ou igual a 15. Enquanto o usuário não digitar um valor válido, solicitar que
    //digite novamente.
    //- Criar um vetor aluno de maxAluno posições, do tipo String.
    //- Criar uma matriz notas de maxAluno linhas e 2 colunas, do tipo double.
    //- Criar um vetor media de 2 posições, do tipo double.
    //- Criar um vetor mediaAluno de maxAluno posições, do tipo double.
    //- Solicitar que o usuário digite os nomes dos alunos, que serão armazenados no vetor aluno.
    //- Solicitar que o usuário digite as notas dos alunos, que deverão ser armazenados na matriz
    //notas (1ª coluna: nota AC1, 2ª coluna: nota AC2). O nome do 1º aluno estará no vetor aluno,
    //índice zero. As notas do 1º aluno estarão na matriz notas, na linha zero.
    //- Calcular a média das notas da AC1 (de todos os alunos) e colocar no vetor media, índice
    //zero.
    //- Calcular a média das notas de AC2 (de todos os alunos) e colocar no vetor media, índice 1.
    //- Calcular a média das notas da AC1 e AC2 do 1º aluno (índice zero) e colocar no vetor
    //mediaAluno, índice zero, e assim sucessivamente.
    //- Exibir os dados em forma de tabela, com os títulos das colunas, de forma que na 1ª coluna,
    //apareçam os nomes dos alunos. Na 2ª coluna, as notas AC1 de cada aluno, na 3ª coluna, as
    //notas AC2, na 4ª coluna a média dos alunos. Utilize a saída formatada para isso, alinhando o
    //nome à esquerda e as notas à direita.
    //- Na última linha, exiba as médias das notas (das colunas) AC1 e AC2.
    //A exibição deverá usar a Saida Formatada e ser algo do tipo:
    //NOME DO ALUNO NOTA AC1 NOTA AC2 MÉDIA DO ALUNO
    //Amanda 5,0 7,5 6,3
    //José 3,0 6,0 4,5
    //Mário 4,5 5,0 4,8
    //Fulano 6,0 8,5 7,3
    //Beltrano 5,5 6,5 6,0
    //MÉDIA DA AC 4,8 6,7
import java.util.Scanner;

    public class Exercicio6 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int maxAluno;
            do {
                System.out.println("Digite um número inteiro maior ou igual a 5 e menor ou igual a 15:");
                maxAluno = leitor.nextInt();
            } while (maxAluno < 5 || maxAluno > 15);

            String[] aluno = new String[maxAluno];
            double[][] notas = new double[maxAluno][2];
            double[] media = new double[2];
            double[] mediaAluno = new double[maxAluno];

            for (int i = 0; i < maxAluno; i++) {
                System.out.println("Digite o nome do aluno " + (i + 1) + ":");
                aluno[i] = leitor.next();
                System.out.println("Digite a nota AC1 do aluno " + aluno[i] + ":");
                notas[i][0] = leitor.nextDouble();
                System.out.println("Digite a nota AC2 do aluno " + aluno[i] + ":");
                notas[i][1] = leitor.nextDouble();
                mediaAluno[i] = (notas[i][0] + notas[i][1]) / 2;
                media[0] += notas[i][0] / maxAluno;
                media[1] += notas[i][1] / maxAluno;
            }

            System.out.printf("%-15s %-10s %-10s %-15s\n", "NOME DO ALUNO", "NOTA AC1", "NOTA AC2", "MÉDIA DO ALUNO");
            for (int i = 0; i < maxAluno; i++) {
                System.out.printf("%-15s %-10.1f %-10.1f %-15.1f\n", aluno[i], notas[i][0], notas[i][1], mediaAluno[i]);
            }
            System.out.printf("%-15s %-10.1f %-10.1f\n", "MÉDIA DA AC", media[0], media[1]);
        }
    }

