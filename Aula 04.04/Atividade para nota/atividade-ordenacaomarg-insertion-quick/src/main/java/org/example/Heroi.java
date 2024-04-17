package org.example;

public class Heroi implements Comparable<Heroi> {

    private int id;
    private String nome;
    private double poder;
    private int idade;
    private int forca;
    private String habilidade;

    public Heroi(int id, String nome, double poder, int idade, int forca, String habilidade) {
        this.id = id;
        this.nome = nome;
        this.poder = poder;
        this.idade = idade;
        this.forca = forca;
        this.habilidade = habilidade;
    }

    // Getters e Setters

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

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public int compareTo(Heroi outroHeroi) {
        // Ordena os heróis pela força
        return Integer.compare(this.forca, outroHeroi.forca);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Poder: " + poder + ", Idade: " + idade + ", Força: " + forca + ", Habilidade: " + habilidade;
    }
}
