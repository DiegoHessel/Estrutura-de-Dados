package org.example;

public class ListaLigada  {
    private Node head;

    public ListaLigada() {
        this.head = new Node(0);
    }

    public Node getHead() {
        return head;
    }

    public void insereNode(int valor) {
        Node novo = new Node(valor);
        novo.setNext(head.getNext());
        head.setNext(novo);
    }
    public void exibe() {
        Node atual = head.getNext();
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getNext();
        }
    }
    public Node buscaNode(int valor){
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
        Node atual = head.next;
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
    public int getTamanho(){
        Node atual  = head.getNext();
        int tamanho = 0;
        while (atual != null) {
            tamanho++;
            atual = atual.getNext();
        }
        return tamanho;
    }
}