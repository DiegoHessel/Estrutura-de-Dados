package org.example;

public class Coordenador extends Funcionario implements Bonificavel{
    private int quantidadeHorasCoordenacaoSemana;
    private Double valorHoraCoordenacao;
    private int quantidadeCursosCoordena;

    public Coordenador(){
    }
    public Coordenador(String cpf, String nome, double salario, int quantidadeHorasCoordenacaoSemana, Double valorHoraCoordenacao, int quantidadeCursosCoordena) {
        super(cpf, nome, salario);
        this.quantidadeHorasCoordenacaoSemana = quantidadeHorasCoordenacaoSemana;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
        this.quantidadeCursosCoordena = quantidadeCursosCoordena;
    }
    @Override
    public Double calculaSalario() {
        return quantidadeHorasCoordenacaoSemana * valorHoraCoordenacao *4.5+ quantidadeCursosCoordena * 500;
    }

    @Override
    public Double getValorBonus() {
        return getSalario()* 0.20;
    }

    public int getQuantidadeHorasCoordenacaoSemana() {
        return quantidadeHorasCoordenacaoSemana;
    }

    public void setQuantidadeHorasCoordenacaoSemana(int quantidadeHorasCoordenacaoSemana) {
        this.quantidadeHorasCoordenacaoSemana = quantidadeHorasCoordenacaoSemana;
    }

    public Double getValorHoraCoordenacao() {
        return valorHoraCoordenacao;
    }

    public void setValorHoraCoordenacao(Double valorHoraCoordenacao) {
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    public int getQuantidadeCursosCoordena() {
        return quantidadeCursosCoordena;
    }

    public void setQuantidadeCursosCoordena(int quantidadeCursosCoordena) {
        this.quantidadeCursosCoordena = quantidadeCursosCoordena;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "quantidadeHorasCoordenacaoSemana=" + quantidadeHorasCoordenacaoSemana +
                ", valorHoraCoordenacao=" + valorHoraCoordenacao +
                ", quantidadeCursosCoordena=" + quantidadeCursosCoordena +
                "} " + super.toString();
    }
}
