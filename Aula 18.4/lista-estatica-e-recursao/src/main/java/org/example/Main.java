package org.example;

public class Main {

    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(10);
        lista.adicionaNoInicioRecursivo(1);
        lista.adicionaNoInicioRecursivo(2);
        lista.adicionaNoInicioRecursivo(3);
        lista.adicionaNoInicioRecursivo(3);
        lista.adicionaNoInicioRecursivo(2);
        lista.adicionaNoInicioRecursivo(2);
        lista.adicionaNoInicioRecursivo(2);
        lista.exibeRecursivo();
        System.out.println("Index of 2: " + lista.buscaRecursivo(2));
        System.out.println("Ocorrencia 3: " + lista.contaOcorrenciasRecursivo(3));
        lista.removePeloIndiceRecursivo(1);
        lista.exibeRecursivo();
    }
}