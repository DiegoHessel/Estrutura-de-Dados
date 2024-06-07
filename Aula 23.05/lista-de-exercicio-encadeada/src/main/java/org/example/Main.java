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

        ListaLigadaOrdenada listaOrdenada = new ListaLigadaOrdenada();
        listaOrdenada.insereNode(5);
        listaOrdenada.insereNode(3);
        listaOrdenada.insereNode(7);
        listaOrdenada.insereNode(1);
        listaOrdenada.insereNode(9);
        listaOrdenada.insereNode(2);
        listaOrdenada.insereNode(8);
        listaOrdenada.insereNode(4);
        listaOrdenada.insereNode(6);
        listaOrdenada.insereNode(10);
        listaOrdenada.exibe();
        System.out.println("Busca: " + listaOrdenada.buscaNode(4).getInfo());
        listaOrdenada.exibe();
        System.out.println("Remove: " + listaOrdenada.removeNode(4));
        listaOrdenada.exibe();

        lista.exibeRecursivo(lista.getHead().getNext());
        System.out.println("Busca: " + lista.buscaNodeRecursivo(lista.getHead().getNext(), 6).getInfo());
        System.out.println("Remove: " + lista.removeNodeRecursivo(lista.getHead().getNext(), 7));
        lista.exibeRecursivo(lista.getHead().getNext());
        System.out.println("Tamanho: " + lista.getTamanhoRecursivo(lista.getHead().getNext()));
    }
}
