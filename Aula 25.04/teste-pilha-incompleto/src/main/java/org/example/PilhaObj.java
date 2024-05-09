package org.example;

public class PilhaObj<T> {

    private T[] pilha;
    private int topo;

    // 02) Construtor
    public PilhaObj(int tamanho) {
        pilha = (T[]) new Object[tamanho];
        this.topo = -1;
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
    public void push(T info) {
        if (!isFull()) {
            pilha[++topo] = info;
        } else {
            throw new IllegalStateException("Pilha cheia!");
        }
    }

    // 06) MÃ©todo pop
    public T pop() {
        if (!isEmpty()) {
            return pilha[topo--];
        } else {

            throw new IllegalStateException("Pilha vazia!");
        }
    }

    // 07) MÃ©todo peek
    public T peek() {
        if (!isEmpty()) {
            return pilha[topo];
        } else {
            return null;
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


    public T[] getPilha() {
        return pilha;
    }

    public void setPilha(T[] pilha) {
        this.pilha = pilha;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public int getTopo() {
        return topo;
    }

    // ler srings invertidas
    public static void inverteString(String texto){
        PilhaObj<Character> pilha = new PilhaObj<>(texto.length());
        for (int i = 0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }
        String invertida = "";
        while (!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
    }
}
