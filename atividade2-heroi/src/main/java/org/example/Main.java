package org.example;

import java.util.Arrays;

public class Main {
    public static void selectionShort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[i]) {
                    int auxiliar = v[i];
                    v[i] = v[j];
                    v[j] = auxiliar;
                }
            }
        }
    }
    public static void selectionSortOtimizado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = v[minIndex];
            v[minIndex] = v[i];
            v[i] = temp;
        }
    }
    public static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static double pesquisaBinaria(int[] vetor, int valor) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        class Heroi implements Comparable<Heroi> {
            private int id;
            private String nome;
            private double poder;
            private int idade;
            private int forca;
            private String habilidade;

            public Heroi(int id, String nome, double poder, int idade, int forca, String habilidade) {
                this.id = id;
                this.nome = nome;
                this.poder = poder;
                this.idade = idade;
                this.forca = forca;
                this.habilidade = habilidade;
            }

            // Getters e Setters

            @Override
            public int compareTo(Heroi outroHeroi) {
                // Ordena os heróis pela força
                return Integer.compare(this.forca, outroHeroi.forca);
            }

            @Override
            public String toString() {
                return "ID: " + id + ", Nome: " + nome + ", Poder: " + poder + ", Idade: " + idade + ", Força: " + forca + ", Habilidade: " + habilidade;
            }
        }


        Heroi[] herois = new Heroi[8];
        herois[0] = new Heroi(1, "Superman", 100.0, 35, 95, "Voo");
        herois[1] = new Heroi(2, "Batman", 95.0, 40, 90, "Inteligência");
        herois[2] = new Heroi(3, "Mulher Maravilha", 90.0, 30, 85, "Força");
        herois[3] = new Heroi(4, "Homem de Ferro", 85.0, 45, 80, "Tecnologia");
        herois[4] = new Heroi(5, "Thor", 80.0, 1500, 100, "Martelo Mjölnir");
        herois[5] = new Heroi(6, "Capitão América", 75.0, 100, 85, "Escudo");
        herois[6] = new Heroi(7, "Hulk", 70.0, 50, 95, "Superforça");
        herois[7] = new Heroi(8, "Homem-Aranha", 65.0, 25, 75, "Agilidade");


        System.out.println("Lista de heróis desordenada:");
        for (Heroi heroi : herois) {
            System.out.println(heroi);
        }

        // Convertendo a força dos heróis em um array de inteiros para ordenar
        int[] forcaHerois = new int[herois.length];
        for (int i = 0; i < herois.length; i++) {
            forcaHerois[i] = herois[i].forca;
        }

        // Ordenando o array de inteiros usando os diferentes métodos de ordenação
        selectionShort(forcaHerois);
        // Ou selectionSortOtimizado(forcaHerois);
        // Ou bubbleSort(forcaHerois);

        // Atualizando a ordem dos heróis com base na ordem dos valores ordenados
        for (int i = 0; i < herois.length; i++) {
            herois[i].forca = forcaHerois[i];
        }

        System.out.println("\nLista de heróis ordenada por força:");
        for (Heroi heroi : herois) {
            System.out.println(heroi);
        }
    }
}