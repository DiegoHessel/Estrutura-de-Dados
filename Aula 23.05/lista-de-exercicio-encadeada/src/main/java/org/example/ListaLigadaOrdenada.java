package org.example;

public class ListaLigadaOrdenada {
    private Node head;

    public ListaLigadaOrdenada() {
        this.head = new Node(0);
    }

    public Node getHead() {
        return head;
    }

    public void insereNode(int valor) {
        Node novo = new Node(valor);
        Node anterior = head;
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() > valor) {
                break;
            }
            anterior = atual;
            atual = atual.getNext();
        }
        novo.setNext(anterior.getNext());
        anterior.setNext(novo);
    }

    public void exibe() {
        Node atual = head.getNext();
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getNext();
        }
    }

    public Node buscaNode(int valor) {
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() == valor) {
                return atual;
            }
            atual = atual.getNext();
        }
        return null;
    }

    public Boolean removeNode(int valor) {
        Node anterior = head;
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() == valor) {
                anterior.setNext(atual.getNext());
                return true;
            }
            anterior = atual;
            atual = atual.getNext();
        }
        return false;
    }

}
