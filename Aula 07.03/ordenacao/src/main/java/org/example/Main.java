package org.example;

public class Main {
    private int comparacao = 0;
    private int troca = 0;

    public void selectionShort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            comparacao++;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[i]) {

                    int auxiliar = v[i];
                    troca++;
                    v[i] = v[j];
                    v[j] = auxiliar;
                }

            }
        }
    }

    public void selectionSortOtimizado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < v.length; j++) {
                comparacao++;
                if (v[j] < v[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = v[minIndex];
            v[minIndex] = v[i];
            troca++;
            v[i] = temp;
        }
    }

    public void bubbleSort(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                comparacao++;
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    troca++;
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }

    }
    public void ordenaDecrescente(int[] v) {
        for (int x = 0; x < v.length; x++) {
            int indice = x;
            for (int y = x + 1; y < v.length; y++) {
                if (v[y] > v[indice]) {
                    int aux = v[indice];
                    v[indice] = v[y];
                    v[y] = aux;
                }
            }
        }
    }



    public int pesqBin(int[] vetor, int x) {
        // x é o valor procurado
        int indInf = 0; // índice inferior
        int indSup = vetor.length - 1; // índice superior

        while (indInf <= indSup) {
            int meio = (indInf + indSup) / 2; // calcula o índice do meio

            if (vetor[meio] == x) {
                return meio; // retorna o índice do elemento encontrado
            } else if (x < vetor[meio]) {
                // x é menor que o elemento do meio
                indSup = meio - 1; // indsup passa a ser meio-1
            } else {
                // x é maior ou igual que o elemento do meio
                indInf = meio + 1; // indinf passa a ser meio+1
            }
        }

        return -1; // quando indInf > indSup, o elemento não está no vetor
    }
//    public int pesquisaBinaria(int[] v, int valor) {
//        int inicio = 0;
//        int fim = v.length - 1;
//        int meio;
//        while (inicio <= fim) {
//            meio = (inicio + fim) / 2;
//            if (v[meio] == valor) {
//                System.out.println("Valor encontrado na posição: " + meio);
//                return meio;
//            } else if (v[meio] < valor) {
//                inicio = meio + 1;
//            } else {
//                fim = meio - 1;
//            }
//        }
//        System.out.println("Valor não encontrado");
//        return inicio;
//    }

    public static void main(String[] args) {
        int[] vetor = {4, 7, 5, 2, 8, 1, 6, 3, 2};
        int[] vetor2 = {4, 7, 5, 2, 8, 1, 6, 3, 2};
        int[] vetor3 = {4, 7, 5, 2, 8, 1, 6, 3, 2};
        int[] vetor4 = {1, 2, 3, 4, 5, 6, 7, 8,};
        Main ordenar1 = new Main();


        ordenar1.selectionShort(vetor2);
        System.out.println("vetor ordenado:");
        for (int i : vetor2) {
            System.out.print(i + " ");

        }
        System.out.println("\nComparacoes: " + ordenar1.comparacao);
        System.out.println("Trocas: " + ordenar1.troca);
        System.out.println("-------------------------------------");
        Main ordenar = new Main();
        ordenar.selectionSortOtimizado(vetor);
        System.out.println("vetor ordenado:");
        for (int i : vetor) {
            System.out.print(i + " ");

        }
        System.out.println("\nComparacoes: " + ordenar.comparacao);
        System.out.println("Trocas: " + ordenar.troca);

        System.out.println("-------------------------------------");
        Main ordenar3 = new Main();
        ordenar3.bubbleSort(vetor3);
        System.out.println("vetor ordenado:");
        System.out.println("\nComparacoes: " + ordenar3.comparacao);
        System.out.println("Trocas: " + ordenar3.troca);
        for (int i : vetor3) {
            System.out.print(i + " ");

        }
        System.out.println("\n-------------------------------------");
        Main ordenar4 = new Main();
        ordenar4.ordenaDecrescente(vetor4);
        System.out.println("vetor ordenado:");

    }

        Main ordenar5 = new Main();

    public void setOrdenar5(Main ordenar5) {
        this.ordenar5 = ordenar5;
        int[] vetor4 = {1,2,3,4,5,6,7};
        ordenar5.ordenaDecrescente(vetor4);
    }
}