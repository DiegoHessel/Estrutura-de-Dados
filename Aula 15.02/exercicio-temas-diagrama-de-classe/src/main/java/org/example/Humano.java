package org.example;

public  class Humano extends Heroi implements Lutador{
    private int inteligencia;
    private int distreza;

    public Humano(String nome, String poder, int vida, int inteligencia, int distreza) {
        super(nome, poder, vida);
        this.inteligencia = inteligencia;
        this.distreza = distreza;
    }
    public void usarArma(){
        System.out.println("Usando arma");
    }
    public void atacar(){
        System.out.println("Atacando " +getPoder());
    }
    public void defender(){
        System.out.println("Defendendo");
    }
}
