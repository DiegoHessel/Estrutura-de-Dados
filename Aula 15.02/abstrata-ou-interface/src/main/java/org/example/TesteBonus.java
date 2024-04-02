package org.example;

import java.util.Scanner;

public class TesteBonus {
    public static void main(String[] args) {
        Coordenador coordenador = new Coordenador();
        Secretaria secretaria = new Secretaria();
        Professor professor = new Professor();

        professor.setSalario(1000);
        professor.setQuantidadeAulasSemana(10);
        professor.setValorHoraAula(10);
        System.out.println(professor.calculaSalario());
        System.out.println(professor.getValorBonus());
        System.out.println("...................................................");
       coordenador.setSalario(1000);
       coordenador.setQuantidadeCursosCoordena(5);
       coordenador.setQuantidadeHorasCoordenacaoSemana(10);
       coordenador.setValorHoraCoordenacao(10.0);
        System.out.println(coordenador.calculaSalario());
        System.out.println(coordenador.getValorBonus());
        System.out.println("...................................................");
        secretaria.setSalario(1000);
        secretaria.setExtra(100.0);
        System.out.println(secretaria.calculaSalario());
    }
}
