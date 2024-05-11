package org.example;

public class PilhaObj <T> {
    private T[] pilha;
    private int topo;

    public PilhaObj(int tamanho) {
        pilha = (T[]) new Object[tamanho];
        topo = 0;
    }

    public void push(T i) {
        pilha[topo++] = i;
    }

    public T pop() {
        return pilha[--topo];
    }

    public T peek() {
        return pilha[topo - 1];
    }

    public boolean isEmpty() {
        return topo == 0;
    }

    public boolean isFull() {
        return topo == pilha.length;
    }

    public int size() {
        return topo;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < topo; i++) {
            s.append(pilha[i].toString());
            s.append(" ");
        }
        return s.toString();
    }
}