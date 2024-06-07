package org.example;

public class ContaBancaria {

    // Atributos
    private Integer numero;
    private Double saldo;

    // Construtor
    public ContaBancaria(Integer numero, Double saldo) {
        if (numero == null || saldo == null) {
            throw new IllegalArgumentException("Número da conta e saldo não podem ser nulos");
        }
        this.numero = numero;
        this.saldo = saldo;
    }

    // Métodos

    /* Método debitar - recebe o valor a ser debitado
       Se o valor for inválido, deve lançar IllegalArgumentException
       Se o saldo for insuficiente para o débito, retorna false
       Senão, atualiza o saldo e retorna true
     */
    public Boolean debitar(Double valor){
        if (valor == null || valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para débito");
        }
        if (this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    /* Método creditar - recebe o valor a ser depositado
       Se o valor for inválido, deve lançar IllegalArgumentException
       Senão, atualiza o saldo
     */
    public boolean creditar(Double valor){
        if (valor == null || valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para crédito");
        }
        this.saldo += valor;
        return true;
    }

    /* Método toString() - retorna uma String formatada com o número e o saldo da conta. */
    @Override
    public String toString() {
        return String.format("Conta Bancária Número: %d, Saldo: %.2f", this.numero, this.saldo);
    }

    // Getters
    public Integer getNumero() {
        return this.numero;
    }

    public Double getSaldo() {
        return this.saldo;
    }
}