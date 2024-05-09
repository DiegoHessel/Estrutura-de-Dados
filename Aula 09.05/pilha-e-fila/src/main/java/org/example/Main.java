package org.example;

public class Main {
    public static void separaPositivoNegativoEmOrdem(int[] vetor1) {
        FilaObj<Integer> positiveQueue = new FilaObj<>();
        FilaObj<Integer> negativeQueue = new FilaObj<>();

        for (int numero : vetor1) {
            if (numero >= 0) {
                positiveQueue.enqueue(numero);
            } else {
                negativeQueue.enqueue(numero);
            }
        }

        while (!positiveQueue.isEmpty()) {
            System.out.print(positiveQueue.dequeue() + " ");
        }

        while (!negativeQueue.isEmpty()) {
            System.out.print(negativeQueue.dequeue() + " ");
        }

        System.out.println();
    }

    public static void separaPositivoNegativoOrdemDiferente(int[] vetor2) {
        FilaObj<Integer> positiveQueue = new FilaObj<>();
        PilhaObj<Integer> negativeStack = new PilhaObj<>();

        for (int numero : vetor2) {
            if (numero >= 0) {
                positiveQueue.enqueue(numero);
            } else {
                negativeStack.push(numero);
            }
        }

        while (!positiveQueue.isEmpty()) {
            System.out.print(positiveQueue.dequeue() + " ");
        }

        while (!negativeStack.isEmpty()) {
            System.out.print(negativeStack.pop() + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetor = {2, 7, -3, -50, 45, -4, 30, -21, 38};

        separaPositivoNegativoEmOrdem(vetor);
        separaPositivoNegativoOrdemDiferente(vetor);
    }
}