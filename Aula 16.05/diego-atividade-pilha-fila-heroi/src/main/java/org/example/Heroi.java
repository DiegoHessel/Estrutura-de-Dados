package org.example;

public class Heroi {
    private Integer id;
    private String nome;
    private int vida;
    private double forca;
    private String habilidade;

    public Heroi(Integer id, String nome, int vida, double forca, String habilidade) {
        this.id = id;
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.habilidade = habilidade;
    }

    public Integer getId() {
        return this.id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public String toString() {
        return "Heroi{" +
                "id=" + id +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", forca=" + forca +
                ", habilidade='" + habilidade + '\'' +
                '}';
    }

}