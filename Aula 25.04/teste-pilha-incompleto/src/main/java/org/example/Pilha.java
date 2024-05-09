package org.example;

public class Pilha {

    // 01) Atributos
    private int[] pilha;
    private int topo;

    // 02) Construtor
    public Pilha(int capacidade) {
        pilha = new int[capacidade];
        topo = -1;
    }

    // 03) MÃ©todo isEmpty
    public Boolean isEmpty() {
        if (topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    // 04) MÃ©todo isFull
    public Boolean isFull() {
        if (topo == pilha.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    // 05) MÃ©todo push
    public void push(int info) {
        if (!isFull()) {
            topo++;
            pilha[topo] = info;
        } else {
            throw new IllegalStateException("Pilha cheia!");
        }
    }

    // 06) MÃ©todo pop
    public int pop() {
        if (!isEmpty()) {
            int temp = pilha[topo];
            topo--;
            return temp;
        } else {

            return -1;
        }
    }

    // 07) MÃ©todo peek
    public int peek() {
        if (!isEmpty()) {
            return pilha[topo];
        } else {
            return -1;
        }
    }

    // 08) MÃ©todo exibe
    public void exibe() {
        if (!isEmpty()) {
            for (int i = 0; i <= topo; i++) {
                System.out.println(pilha[i]);
            }
        } else {
            System.out.println("Pilha vazia!");
        }
    }


    //Getters & Setters (manter)

    public int[] getPilha() {
        return pilha;
    }

    public void setPilha(int[] pilha) {
        this.pilha = pilha;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public int getTopo() {
        return topo;
    }

}