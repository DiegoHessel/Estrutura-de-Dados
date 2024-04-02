package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Mago mago = new Mago("Gandalf", "Magia", 100, 100, 100);
        int escolha;
        do {
            System.out.println("""
                    Escolha um personagem para Ser criado:
                    1 - Mago
                    2 - Inimigo
                    3 - Humano
                    4 - Heroi
                    5 - Sair
                    """);
            Scanner scanner = new Scanner(System.in);
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1 -> {
                    mago = new Mago("Gandalf", "Magia", 100, 100, 100);
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println(mago);
                    mago.atacar();
                    mago.defender();
                    mago.lancarMagia();
                    System.out.println("-----------------------------------------------------------------------------");
                }
                case 2 -> {
                    Inimigo inimigo = new Inimigo("Orc", "Espada", 100);
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println(inimigo);
                    inimigo.atacar();
                    System.out.println("-----------------------------------------------------------------------------");
                }
                case 3 -> {
                    Humano humano = new Humano("Aragorn", "Espada", 100, 100, 100);
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println(humano);
                    humano.atacar();
                    humano.defender();
                    humano.usarArma();
                    System.out.println("-----------------------------------------------------------------------------");
                }
                case 4 -> {
                Heroi heroi = new Humano("Aragorn", "Espada", 100, 100, 100 );
                    System.out.println(heroi);

                    
                    heroi.atacar();
                    heroi.defender();
                }
                case 5 -> System.exit(0);
            }
        } while (escolha != 5);

                Heroi[] herois = new Heroi[8];
                herois[0] = new Heroi(1, "Capitão América", 80.0, 100, "Marvel", true) {
                    @Override
                    public void atacar() {
                        System.out.println("Atacando com o escudo");
                    }

                    @Override
                    public void defender() {
                        System.out.println("Defendendo com o escudo");
                    }
                };
                herois[1] = new Heroi(2, "Homem-Aranha", 70.0, 25, "Marvel", true) {
                    @Override
                    public void atacar() {
                        System.out.println("Atacando com teia");
                    }

                    @Override
                    public void defender() {
                        System.out.println("Defendendo com teia");
                    }
                };
                herois[2] = new Heroi(3, "Batman", 90.0, 40, "DC", true) {
                    @Override
                    public void atacar() {
                        System.out.println("Atacando com o escudo");
                    }

                    @Override
                    public void defender() {
                        System.out.println("Defendendo com o escudo");
                    }
                };
                herois[3] = new Heroi(4, "Mulher Maravilha", 85.0, 5000, "DC", true) {
                    @Override
                    public void atacar() {
                        System.out.println("Atacando com o laço");
                    }

                    @Override
                    public void defender() {
                        System.out.println("Defendendo com o laço");
                    }
                };

        herois[4] = new Heroi(5, "Mulher Maravilha", 85.0, 5000, "DC", true) {
            @Override
            public void atacar() {
                System.out.println("Atacando com o laço");
            }

            @Override
            public void defender() {
                System.out.println("Defendendo com o laço");
            }
        };

        herois[5] = new Heroi(6, "Mulher Maravilha", 85.0, 5000, "DC", true) {
            @Override
            public void atacar() {
                System.out.println("Atacando com o laço");
            }

            @Override
            public void defender() {
                System.out.println("Defendendo com o laço");
            }
        };

        herois[7] = new Heroi(7, "Mulher Maravilha", 85.0, 5000, "DC", true) {
            @Override
            public void atacar() {
                System.out.println("Atacando com o laço");
            }

            @Override
            public void defender() {
                System.out.println("Defendendo com o laço");
            }
        };

        System.out.println("**Heróis Desordenados:**");
        for (Heroi h : herois) {
                        System.out.println(h);
                    }

                    // Ordenação por nome em ordem decrescente

        System.out.println("\n**Ordenando por nome (decrescente):**");
                    // Algoritmo de ordenação por seleção
                    ordenacaoSelecao(herois);
        for (Heroi h : herois) {
                        System.out.println(h);
                    }

        System.out.println("\n**Pesquisando por nome (existente):**");
                    Heroi heroiEncontrado = pesquisaBinaria(herois, "Mulher Maravilha");
        if (heroiEncontrado != null) {
                        System.out.println("Heroi encontrado: " + heroiEncontrado);
                    } else {
                        System.out.println("Heroi não encontrado!");
                    }

        System.out.println("\n**Pesquisando por nome (inexistente):**");
                    heroiEncontrado = pesquisaBinaria(herois, "Aquaman");
        if (heroiEncontrado != null) {
                        System.out.println("Heroi encontrado: " + heroiEncontrado);
                    } else {
                        System.out.println("Heroi não encontrado!");
                    }
                }

                // Algoritmo de ordenação por seleção (ordem decrescente)
                public static void ordenacaoSelecao(Heroi[] herois) {
                    for (int i = 0; i < herois.length - 1; i++) {
                        int indiceMaior = i;
                        for (int j = i + 1; j < herois.length; j++) {
                            if (herois[j].compareTo(herois[indiceMaior]) > 0) {
                                indiceMaior = j;
                            }
                        }
                        if (indiceMaior != i) {
                            Heroi temp = herois[i];
                            herois[i] = herois[indiceMaior];
                            herois[indiceMaior] = temp;
                        }
                    }
                }

                public static Heroi pesquisaBinaria(Heroi[] herois, String nomeProcurado) {
                    int inicio = 0;
                    int fim = herois.length - 1;
                    while (inicio <= fim) {
                        int meio = (inicio + fim) / 2;
                        int comparacao = herois[meio].getNome().compareTo(nomeProcurado);
                        if (comparacao == 0) {
                            return herois[meio];
                        } else if (comparacao > 0) {
                            fim = meio - 1;
                        } else {
                            inicio = meio + 1;
                        }
                    }
                    return null;
                }
            }