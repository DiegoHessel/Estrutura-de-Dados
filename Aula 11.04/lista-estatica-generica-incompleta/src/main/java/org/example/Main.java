package org.example;

public class Main {
    public static void main(String[] args){
        ListaObj<String> lista = new ListaObj(5);
lista.adiciona("D");
lista.adiciona("RR");
lista.adiciona("U");
lista.adiciona("s");
        lista.exibe();
        lista.removePeloIndice(1);
        lista.exibe();
    }
}