package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    List <Bonificavel>controleBonus;

    public ControleBonus() {
        this.controleBonus = new ArrayList<>();
    }
public void adicionarBonificavel(Bonificavel b){
        this.controleBonus.add(b);
    }
    public void exibirTotalDeBonus(){
        Double total = 0.0;
        for (Bonificavel b : controleBonus){
            total += b.getValorBonus();
        }
        System.out.println("Total de bonus: " + total);
    }
    public double CalculaTotalDeBonus(){
        Double total = 0.0;
        for (Bonificavel b : controleBonus){
            total += b.getValorBonus();
        }
        return total;
    }

}
