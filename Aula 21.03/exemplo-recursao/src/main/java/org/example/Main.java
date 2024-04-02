package org.example;

public class Main {
    public static void contagemRegressiva(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void conetagemRegressivaRecursiva(int n) {
        if (n == 0) {// caso basico - não chama mais a si mesmo
            System.out.println(n);
        } else {// parte recursiva onde ele chama a si mesmo
            System.out.println(n);
            conetagemRegressivaRecursiva(n - 1);
            System.out.println("*** Fim da intancia n= " + n);
        }
    }
    // definicao do fatrorial na matematica
    //EX: 4! 4*3*2*1 = 4*3!
    // se n = 0, entao n! =1
    // se nao n >0, entao n! =n *(n-1)
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
// metodo recursivo que exibe um vetor
public static void exibirVetor(int[]v,int i){
        if (i< v.length){
            System.out.println(v[i]);
            exibirVetor(v,i +1);
        }

}public static void exibirVetorInvertido(int[]v,int i){
        if (i>=0){
            System.out.println(v[i]);
            exibirVetorInvertido(v,i -1);
        }

}

    public static void main(String[] args) {
        int[] vetor ={10,20,30,40,50};

        System.out.println("contagem regressiva do 5:");
        contagemRegressiva(5);
        System.out.println("-----------");
        System.out.println("Contagem recursivo regressivo");
        conetagemRegressivaRecursiva(5);
        System.out.println("-----------");
        System.out.println("Fatorial 4!" + fatorial(4));
        System.out.println("Fatorial 5!" + fatorial(5));
        System.out.println("-----------");
        System.out.println("Exibir vetor");
        exibirVetor(vetor, 0);
        System.out.println("-----------");
        System.out.println("Exibir vetor Invertido");
        exibirVetorInvertido(vetor, vetor.length -1);
    }


}