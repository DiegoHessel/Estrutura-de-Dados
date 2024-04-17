package org.example;

public class Heroi{


    private Integer id;
    private String nome;
    private double poder;
    private Integer idade;
    private double forca;
    private String habilidade;
    private String squad;

    public Heroi(int id, String nome, double poder, int idade, double forca, String habilidade, String squad) {
        this.id = id;
        this.nome = nome;
        this.poder = poder;
        this.idade = idade;
        this.forca = forca;
        this.habilidade = habilidade;
        this.squad = squad;
    }

    public Heroi(int id) {
        this.id = id;
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

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public int getTamanho() {
    return id;
    }

    public Object getName() {
    return nome;
    }

    @Override
    public String toString() {
        return "Heroi{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", poder=" + poder +
                ", idade=" + idade +
                ", forca=" + forca +
                ", habilidade='" + habilidade + '\'' +
                ", squad='" + squad + '\'' +
                '}';
    }
}
