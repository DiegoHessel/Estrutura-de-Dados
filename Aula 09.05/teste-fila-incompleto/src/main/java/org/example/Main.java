package org.example;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        System.out.println(fila.isEmpty());
        System.out.println(fila.isFull());
        fila.insert("primeiro");
        fila.insert("segundo");
        fila.insert("terceiro");
        fila.insert("quarto");
        fila.insert("quinto");

        System.out.println(fila.isEmpty());
        System.out.println(fila.isFull());
        fila.exibe();
        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila.peek());
        System.out.println(fila.poll());
        fila.exibe();
        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila.isEmpty());
        System.out.println(fila.isFull());
        fila.exibe();
    }
}