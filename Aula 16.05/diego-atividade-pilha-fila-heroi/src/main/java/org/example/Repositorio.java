package org.example;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<Heroi> lista;
    private PilhaObj<Integer> pilha;
    private FilaObj<Heroi> fila;

    public Repositorio() {
        lista = new ArrayList<>();
        pilha = new PilhaObj<>(10);
        fila = new FilaObj<>(10);
    }

    public void salvar(Heroi heroi) {
        lista.add(heroi);
        pilha.push(heroi.getId());
    }

    public void deletar(int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.remove(i);
                return;
            }
        }
        System.out.println("ID inexistente");
    }

    public void exibir() {
        if (lista.isEmpty()) {
            System.out.println("Repositório vazio");
        } else {
            for (Heroi heroi : lista) {
                System.out.println(heroi);
            }
        }
        System.out.println("Pilha: " + pilha);
        System.out.println("Fila: " + fila);
    }

    public void desfazer() {
        if (pilha.isEmpty()) {
            System.out.println("Não há nada a desfazer");
        } else {
            deletar(pilha.pop());
        }
    }

    public void agendarSalvar(Heroi heroi) {
        fila.insert(heroi);
    }

    public void executarAgendado(int qtdOperacoes) {
        if (fila.isEmpty()) {
            System.out.println("Não há operações agendadas");
        } else if (qtdOperacoes <= 0 || qtdOperacoes > fila.size()) {
            System.out.println("Quantidade inválida");
        } else {
            for (int i = 0; i < qtdOperacoes; i++) {
                salvar(fila.remove());
            }
        }
    }
}