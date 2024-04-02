package org.example;

public class Inimigo {
    private String nome;
    private String poder;
    int vida;

    public Inimigo() {
    }

    public Inimigo(String nome, String poder, int vida) {
        this.nome = nome;
        this.poder = poder;
        this.vida = vida;
    }
    public void atacar(){
        System.out.println(nome+ " Atacando" +poder);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Inimigo{" +
                "nome='" + nome + '\'' +
                ", poder='" + poder + '\'' +
                ", vida=" + vida +
                '}';
    }
}
