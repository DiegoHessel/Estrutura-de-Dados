package org.example;

public abstract class Heroi implements Lutador{
    private int id;
    private String nome;
    private double poder;
    private int idade;
    private String universo;
    private boolean heroico;

    public Heroi(int id, String nome, double poder, int idade, String universo, boolean heroico) {
        this.id = id;
        this.nome = nome;
        this.poder = poder;
        this.idade = idade;
        this.universo = universo;
        this.heroico = heroico;
    }

    public Heroi(String nome, String poder, int vida) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public boolean isHeroico() {
        return heroico;
    }

    public void setHeroico(boolean heroico) {
        this.heroico = heroico;
    }


    @Override
    public String toString() {
        return "ID: " + id + "\n"
                + "Nome: " + nome + "\n"
                + "Poder: " + poder + "\n"
                + "Idade: " + idade + "\n"
                + "Universo: " + universo + "\n"
                + "Heroico: " + heroico + "\n";
    }

    protected int compareTo(Heroi herois) {
        return 0;
    }
}

