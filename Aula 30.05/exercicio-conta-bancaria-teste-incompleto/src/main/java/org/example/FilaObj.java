package org.example;

public class FilaObj<T> {

    // Atributos
    private int tamanho;
    private T[] fila;
    private int inicio;
    private int fim;

    // Construtor
    @SuppressWarnings("unchecked")
    public FilaObj(int capacidade) {
        this.fila = (T[]) new Object[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = 0;
    }

    // Métodos

    // Retorna true se a fila está vazia e false caso contrário
    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    // Retorna true se a fila está cheia e false caso contrário
    public boolean isFull() {
        return this.tamanho == this.fila.length;
    }

    // Se a fila não estiver cheia, insere info na fila
    // Se a fila estiver cheia, deve lançar IllegalStateException
    public void insert(T info) {
        if (isFull()) {
            throw new IllegalStateException("Fila cheia");
        }
        this.fila[this.fim] = info;
        this.fim = (this.fim + 1) % this.fila.length;
        this.tamanho++;
    }

    // Retorna o primeiro da fila
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return this.fila[this.inicio];
    }

    // Remove e retorna o primeiro elemento da fila
    // Antes de retornar, se a fila não estiver vazia, deve fazer a fila "andar"
    public T poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        T info = this.fila[this.inicio];
        this.inicio = (this.inicio + 1) % this.fila.length;
        this.tamanho--;
        return info;
    }

    // Exibe os elementos da fila
    public void exibe() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.fila[(this.inicio + i) % this.fila.length]);
        }
    }

    // Retorna o vetor fila
    public T[] getFila() {
        return this.fila;
    }

    public T remove() {
        return poll();
    }
}