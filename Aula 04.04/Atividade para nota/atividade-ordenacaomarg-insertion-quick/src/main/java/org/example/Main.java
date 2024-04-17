package org.example;

public class Main {

    public static void insertionSortHerois(Heroi[] herois) {
        for (int i = 1; i < herois.length; i++) {
            Heroi key = herois[i];
            int j = i - 1;

            while (j >= 0 && herois[j].getIdade() > key.getIdade()) {
                herois[j + 1] = herois[j];
                j = j - 1;
            }
            herois[j + 1] = key;
        }
    }

    public static void mergeSortHerois(Heroi[] herois, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;

            mergeSortHerois(herois, esquerda, meio);
            mergeSortHerois(herois, meio + 1, direita);

            mergeHerois(herois, esquerda, meio, direita);
        }
    }

    private static void mergeHerois(Heroi[] herois, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        Heroi[] L = new Heroi[n1];
        Heroi[] R = new Heroi[n2];

        System.arraycopy(herois, esquerda, L, 0, n1);
        System.arraycopy(herois, meio + 1, R, 0, n2);

        int i = 0, j = 0;
        int k = esquerda;

        while (i < n1 && j < n2) {
            if (L[i].getForca() <= R[j].getForca()) {
                herois[k] = L[i];
                i++;
            } else {
                herois[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            herois[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            herois[k] = R[j];
            j++;
            k++;
        }
    }


    public static void quickSortHerois(Heroi[] herois, int baixo, int alto) {
        if (baixo < alto) {
            int pi = particaoHerois(herois, baixo, alto);

            quickSortHerois(herois, baixo, pi - 1);
            quickSortHerois(herois, pi + 1, alto);
        }
    }

    private static int particaoHerois(Heroi[] herois, int baixo, int alto) {
        Heroi pivo = herois[alto];
        int i = (baixo - 1);

        for (int j = baixo; j < alto; j++) {
            if (herois[j].getPoder() < pivo.getPoder()) {
                i++;

                Heroi temp = herois[i];
                herois[i] = herois[j];
                herois[j] = temp;
            }
        }

        Heroi temp = herois[i + 1];
        herois[i + 1] = herois[alto];
        herois[alto] = temp;

        return i + 1;
    }


    public static void main(String[] args) {
        Heroi[] herois = {
                new Heroi(1, "Superman", 100.0, 35, 95, "Voo"),
                new Heroi(2, "Batman", 95.0, 40, 90, "Inteligência"),
                new Heroi(3, "Mulher Maravilha", 90.0, 30, 85, "Força"),
                new Heroi(4, "Homem de Ferro", 85.0, 45, 80, "Tecnologia"),
                new Heroi(5, "Thor", 80.0, 1500, 100, "Martelo Mjölnir"),
                new Heroi(6, "Capitão América", 75.0, 100, 85, "Escudo"),
                new Heroi(7, "Hulk", 70.0, 50, 95, "Superforça"),
                new Heroi(8, "Homem-Aranha", 65.0, 25, 75, "Agilidade")
        };

        System.out.println("Antes da ordenação:");
        for (Heroi heroi : herois) {
            System.out.println(heroi);
        }
        quickSortHerois(herois, 0, herois.length - 1);

        System.out.println("\nApós a ordenação por idade:");
        for (Heroi heroi : herois) {
            System.out.println(heroi);
        }


        mergeSortHerois(herois, 0, herois.length - 1);
        System.out.println("\nApós a ordenação por força:");
        for (Heroi heroi : herois) {
            System.out.println(heroi);
        }

        insertionSortHerois(herois);
        System.out.println("\nApós a ordenação por poder:");
        for (Heroi heroi : herois) {
            System.out.println(heroi);
        }
    }
}