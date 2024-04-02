package org.example;

public class Professor extends Funcionario implements Bonificavel{
    private int quantidadeAulasSemana;
    private double valorHoraAula;
    public Professor(){

    }
    public Professor(String cpf, String nome, double salario, int quantidadeAulasSemana, double valorHoraAula) {
        super(cpf, nome, salario);
        this.quantidadeAulasSemana = quantidadeAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }
    @Override
    public Double calculaSalario() {
        return (quantidadeAulasSemana*valorHoraAula)*4.5;
    }


    public int getQuantidadeAulasSemana() {
        return quantidadeAulasSemana;
    }

    public void setQuantidadeAulasSemana(int quantidadeAulasSemana) {
        this.quantidadeAulasSemana = quantidadeAulasSemana;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "quantidadeAulasSemana=" + quantidadeAulasSemana +
                ", valorHoraAula=" + valorHoraAula +
                "} " + super.toString();
    }

    @Override
    public Double getValorBonus() {
        return getSalario()*0.15;
        }
    }
