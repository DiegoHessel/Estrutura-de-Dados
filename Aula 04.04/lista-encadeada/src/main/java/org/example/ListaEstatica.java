package org.example;

public class ListaEstatica {
    private int[] lista;
    private int nroElem;

    public ListaEstatica(int tamanho) {
        lista = new int[tamanho];
        nroElem = 0;
    }

    public void substitui(int valorAntigo, int valorNovo) {
        boolean encontrado = false;
        for (int i = 0; i < nroElem; i++) {
            if (lista[i] == valorAntigo) {
                lista[i] = valorNovo;
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }
    }

    public int contaOcorrencias(int valor) {
        int contador = 0;
        for (int i = 0; i < nroElem; i++) {
            if (lista[i] == valor) {
                contador++;
            }
        }
        return contador;
    }

    public void adicionaNoInicio(int valor) {
        if (nroElem >= lista.length) {
            System.out.println("Lista cheia.");
            return;
        }
        for (int i = nroElem; i > 0; i--) {
            lista[i] = lista[i - 1];
        }
        lista[0] = valor;
        nroElem++;
    }

    // Método para exibir os elementos da lista
    public void exibe() {
        if (nroElem == 0) {
            System.out.println("A lista está vazia.");
        } else {
            for (int i = 0; i < nroElem; i++) {
                System.out.print(lista[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(5);

        lista.adicionaNoInicio(30);
        lista.adicionaNoInicio(20);
        lista.adicionaNoInicio(10);

        System.out.println("Lista original:");
        lista.exibe();

        lista.substitui(20, 50);
        System.out.println("Lista após substituir 20 por 50:");
        lista.exibe();

        int ocorrencias = lista.contaOcorrencias(10);
        System.out.println("Ocorrências do número 10: " + ocorrencias);

        lista.adicionaNoInicio(40);
        System.out.println("Lista após adicionar 40 no início:");
        lista.exibe();
    }
}