package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Heroi> herois = new ArrayList<>();
        herois.add(new Heroi(1,"diego",10.4,21,9.1,"força", "NA.UM"));
        herois.add(new Heroi(2,"erick",5,20,5.1,"velocidade", "NA.UM"));
        herois.add(new Heroi(3,"alves",10.4,1,5.1,"code", "NA.UM"));
        herois.add(new Heroi(4,"lima",10.4,1,5.1,"foco", "NA.UM"));
        herois.add(new Heroi(5,"bryan",10.4,1,5.1,"visão", "NA.UM"));
        herois.add(new Heroi(6,"davi",10.4,1,5.1,"correr", "NA.UM"));
        for (Heroi heroi : herois) {
            System.out.println(heroi);
        }ArquivoCsv.gravarArquivoCsv(herois,"herois");
        ArquivoCsv.leExibeArquivoCsv("herois");
    }
}

