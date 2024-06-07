package org.example;

import javax.swing.*;

public class ListaLigada {
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

    public int getTamanho() {
        Node atual = head.getNext();
        int tamanho = 0;
        while (atual != null) {
            tamanho++;
            atual = atual.getNext();
        }
        return tamanho;
    }

    public void exibeRecursivo(Node node) {
        if (node != null) {
            System.out.println(node.getInfo());
            exibeRecursivo(node.getNext());
        }
    }

    public Node buscaNodeRecursivo(Node node, int valor) {
        if (node == null) {
            return null;
        }
        if (node.getInfo() == valor) {
            return node;
        }
        return buscaNodeRecursivo(node.getNext(), valor);
    }

    public Boolean removeNodeRecursivo(Node node, int valor) {
        if (node == null) {
            return false;
        }
        if (node.getInfo() == valor) {
            node.setNext(node.getNext().getNext());
            return true;
        }
        return removeNodeRecursivo(node.getNext(), valor);
    }

    public int getTamanhoRecursivo(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + getTamanhoRecursivo(node.getNext());
    }

    public void inserirAposPrimeiroImpar(int valor) {
        Node novo = new Node(valor);
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() % 2 != 0) {
                novo.setNext(atual.getNext());
                atual.setNext(novo);
                return;
            }
            atual = atual.getNext();
        }
    }

    public int getElemento(int indice) {
        Node atual = head.getNext();
        int i = 0;
        while (atual != null) {
            if (i == indice) {
                return atual.getInfo();
            }
            i++;
            atual = atual.getNext();
        }
        return -1;
    }
    public Boolean removeOcorrencias(int valor) {
        Node anterior = head;
        Node atual = head.getNext();
        boolean removeu = false;
        while (atual != null) {
            if (atual.getInfo() == valor) {
                anterior.setNext(atual.getNext());
                removeu = true;
            } else {
                anterior = atual;
            }
            atual = atual.getNext();
        }
        return removeu;
    }
    public void arrayToList(int[] vetor) {
        if (vetor.length > 0) {
            for (int i = vetor.length - 1; i >= 0; i--) {
            insereNode(vetor[i]);
        }
    }else {
            System.out.println("Operação invalida");
        }
    }

}