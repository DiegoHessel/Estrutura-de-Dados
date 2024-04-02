package org.example;

public class Mago extends Heroi implements Lutador{
    private int mana;
    private int conhecimentoArcano;

    public Mago(String nome, String poder, int vida, int mana, int conhecimentoArcano) {
        super(nome, poder, vida);
        this.mana = mana;
        this.conhecimentoArcano = conhecimentoArcano;
    }
    public void lancarMagia(){
        System.out.println(" Usando magia "+getPoder());
    }
    public void atacar(){
        System.out.println(" Atacando " +getPoder());
    }
    public void defender(){
        System.out.println(" Defendendo");
    }

}
