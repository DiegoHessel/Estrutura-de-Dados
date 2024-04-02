package org.example;

public class Secretaria extends Funcionario {
    private Double extra;

    public Secretaria() {
        }
    public Secretaria(String cpf, String nome, double salario, Double extra) {
        super(cpf, nome, salario);
        this.extra = extra;
    }
    @Override
    public Double calculaSalario() {
        return getSalario()+ extra;
    }

    public Double getExtra() {
        return extra;
    }

    public void setExtra(Double extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Secretaria{" +
                "extra=" + extra +
                "} " + super.toString();
    }
}
