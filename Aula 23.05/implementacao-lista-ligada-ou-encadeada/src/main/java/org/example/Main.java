package org.example;

public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.insereNode(1);
        lista.insereNode(2);
        lista.insereNode(3);
        lista.insereNode(4);
        lista.insereNode(5);
        lista.insereNode(6);
        lista.insereNode(7);
        lista.insereNode(8);
        lista.insereNode(9);
        lista.insereNode(10);
        lista.exibe();
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Busca: " + lista.buscaNode(5).getInfo());
        lista.exibe();
        System.out.println("Remove: " + lista.removeNode(5));
        lista.exibe();
        System.out.println("Tamanho: " + lista.getTamanho());
    }
}