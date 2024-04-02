import java.util.Scanner;

public class Main {
    public static void exibeVetor(int[] v) {
        //Exibindo o vetor
        for (int i = 0; i < v.length; i++) {
            System.out.println("Vetor [" + i + "] " + v[i]);
        }
    }

    public static void leVetor(int[] v) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite o valor de vetor[" + i + "]");
            v[i] = leitor.nextInt();
        }
    }

    public static void main(String[] args) {
        // criação de de um leitor
        Scanner leitor = new Scanner(System.in);

        // criação de um vetor de itens
        int[] vetor = new int[5];

        // Criando um 2° vetor com itens, ja inicializado com valores
        int[] vetor2 = {100, 200, 300, 400, 500, 600, 700};
        // criando um 3° vetor como Sring
        String[] vetor3 = new String[4];
        // declaração de um 4° vetor que tera seu tamanho digitado pelo usuario
        int[] vetor4;
        int tamanho;


        //preenchendo vetores com valores
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 10;
        }
        // exibindo um vetor
        System.out.println("Vetor 1:");
        exibeVetor(vetor);
        //preenchendo o vetor com valores digitado
        leVetor(vetor);
        // exibindo um vetor2°
        System.out.println("Vetor 2:");
        exibeVetor(vetor2);
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println("Digite o valor de vetor[" + i + "]");
            vetor3[i] = leitor.next();
        }
        //exibindo o 3°
        System.out.println("Vetor 3:");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println("Vetor [" + i + "] " + vetor3[i]);
        }

        //Solicite que o usuario digite o valor do tamanho4
        // Esse valor tem q ser maior que 2

        do {
            System.out.println("Digite o tamanho do vetor 4");
            System.out.println("Esse valor tem que ser maior que 2");
            tamanho = leitor.nextInt();
        } while (tamanho <= 2);
        System.out.println("Vetor 4:");
        vetor4 = new int[tamanho];

        leVetor(vetor4);
        exibeVetor(vetor4);
        System.out.println("------------------------------------");
        // desafio 01
        // exiba a soma dos valores do 1° vetor
        int somaVetor = 0;
        for (int i = 0; i < vetor.length; i++) {
            somaVetor += vetor[i];
            System.out.println("Soma do vetor 1 = " + somaVetor);
        }
        System.out.println("------------------------------------");
        // desafio 02
        // exiba a soma dos valores do 1° vetor que são pares
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                System.out.println("Soma dos valores pares do vetor 1 = " + soma);
            }
        }
        System.out.println("------------------------------------");
        // desafio 03
        // crie um vetor de string inicializado com os nomes dos dias da semana

        String[] dias = {"domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sabado"};

        // fiqe em um loop ate que o usuario digite um numero entre 1 e 7
        int dia;
        do {
            System.out.println("Digite um numero entre 1 e 7");
            dia = leitor.nextInt();
        } while (dia < 1 || dia > 7);
        System.out.println("O dia da semana que você digitou é " + dias[dia - 1]);
        //enquanto não for um numero valido solicite que o usuario digite novamente
        System.out.println("------------------------------------");
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Dia " + (i + 1) + " = " + dias[i]);
        }
        //exibir que o dia da semana corretamente ao numero digitado

        // sendo '1' = domingo, '2' = segunda, '3' = terça, '4' = quarta, '5' = quinta, '6' = sexta, '7' = sabado
    }

}