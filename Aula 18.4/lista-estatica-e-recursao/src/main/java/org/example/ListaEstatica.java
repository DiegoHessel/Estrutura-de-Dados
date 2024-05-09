package org.example;

public class ListaEstatica {
    private int[] lista;
    private int nrElemente;

    public ListaEstatica(int dimensiune) {
        lista = new int[dimensiune];
        nrElemente = 0;
    }

    public void exibeRecursivo() {
        if (nrElemente == 0) {
            System.out.println("Lista vazia");
        } else {
            exibeRecursivo(0);
        }
    }

    private void exibeRecursivo(int index) {
        if (index < nrElemente) {
            System.out.println(lista[index]);
            exibeRecursivo(index + 1);
        }
    }

    public int buscaRecursivo(int valor) {
        return buscaRecursivo(valor, 0);
    }

    private int buscaRecursivo(int valor, int index) {
        if (index < nrElemente) {
            if (lista[index] == valor) {
                return index;
            } else {
                return buscaRecursivo(valor, index + 1);
            }
        }
        return -1;
    }

    public int contaOcorrenciasRecursivo(int valor) {
        return contaOcorrenciasRecursivo(valor, 0);
    }

    private int contaOcorrenciasRecursivo(int valor, int index) {
        if (index < nrElemente) {
            if (lista[index] == valor) {
                return 1 + contaOcorrenciasRecursivo(valor, index + 1);
            } else {
                return contaOcorrenciasRecursivo(valor, index + 1);
            }
        }
        return 0;
    }

    public boolean removePeloIndiceRecursivo(int index) {
        if (index < 0 || index >= nrElemente) {
            return false;
        } else {
            deslocaParaEsquerdaRecursivo(index);
            nrElemente--;
            return true;
        }
    }

    private void deslocaParaEsquerdaRecursivo(int index) {
        if (index < nrElemente - 1) {
            lista[index] = lista[index + 1];
            deslocaParaEsquerdaRecursivo(index + 1);
        }
    }

    public void adicionaNoInicioRecursivo(int valor) {
        if (nrElemente == lista.length) {
            System.out.println("Lista cheia");
        } else {
            deslocaParaDireitaRecursivo(nrElemente - 1);
            lista[0] = valor;
            nrElemente++;
        }
    }

    private void deslocaParaDireitaRecursivo(int index) {
        if (index >= 0) {
            lista[index + 1] = lista[index];
            deslocaParaDireitaRecursivo(index - 1);
        }
    }
}