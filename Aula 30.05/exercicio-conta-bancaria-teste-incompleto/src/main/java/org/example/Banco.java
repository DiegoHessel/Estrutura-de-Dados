package org.example;

public class Banco {

    // Atributos
    PilhaObj<Operacao> pilhaOperacao = new PilhaObj(10);
    FilaObj<Operacao> filaOperacao = new FilaObj(10);
    // Contador de operações empilhadas
    Integer contadorOperacao = 0;

    // Métodos

    public void debitar(Double valor, ContaBancaria conta) {
        if (conta.debitar(valor)) {
            Operacao operacao = new Operacao(conta, "Débito", valor);
            pilhaOperacao.push(operacao);
            contadorOperacao++;
        }
    }

    public void creditar(Double valor, ContaBancaria conta) {
        if (conta.creditar(valor)) {
            Operacao operacao = new Operacao(conta, "Crédito", valor);
            pilhaOperacao.push(operacao);
            contadorOperacao++;
        }
    }

    public void desfazerOperacao(Integer qtdOperacaoDesfeita) {
        if (qtdOperacaoDesfeita <= 0 || qtdOperacaoDesfeita > contadorOperacao) {
            throw new IllegalArgumentException("Quantidade de operações a serem desfeitas é inválida");
        }
        for (int i = 0; i < qtdOperacaoDesfeita; i++) {
            Operacao operacao = pilhaOperacao.pop();
            if (operacao.getTipo().equals("Débito")) {
                operacao.getConta().creditar(operacao.getValor());
            } else {
                operacao.getConta().debitar(operacao.getValor());
            }
            contadorOperacao--;
        }
    }

    public void agendarOperacao(String tipoOperacao, Double valor, ContaBancaria conta) {
        if (tipoOperacao == null || valor == null || conta == null ||
                !(tipoOperacao.equals("Débito") || tipoOperacao.equals("Crédito")) ||
                valor <= 0) {
            throw new IllegalArgumentException("Argumentos inválidos");
        }
        Operacao operacao = new Operacao(conta, tipoOperacao, valor);
        filaOperacao.insert(operacao);
    }

    public void executarOperacoesAgendadas() {
        while (!filaOperacao.isEmpty()) {
            Operacao operacao = filaOperacao.remove();
            if (operacao.getTipo().equals("Débito")) {
                operacao.getConta().debitar(operacao.getValor());
            } else {
                operacao.getConta().creditar(operacao.getValor());
            }
        }
    }

    // Getters
    public PilhaObj<Operacao> getPilhaOperacao() {
        return pilhaOperacao;
    }

    public FilaObj<Operacao> getFilaOperacao() {
        return filaOperacao;
    }

    public Integer getContadorOperacao() {
        return contadorOperacao;
    }
}