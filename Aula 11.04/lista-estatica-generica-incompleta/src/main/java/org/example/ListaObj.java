package org.example;

public class ListaObj <T> {

    // 01) Declarar vetor de int:
    // É inicializado no construtor
    private T[] vetor;
    private int nroElem;

    public ListaObj(T[] vetor, int nroElem) {
        this.vetor = vetor;
        this.nroElem = nroElem;
    }

    // 03) Criar Construtor:
    // Recebe como argumento o tamanho máximo do vetor
    // Cria vetor com tamanho máximo informado
    // Inicializa nroElem
    public ListaObj(int tamanho) {
        vetor = (T[]) new Object[tamanho];
        nroElem = 0;
    }

    // 04) Método adiciona:
    // Recebe o elemento a ser adicionado na lista
    // Se a lista estiver cheia usar IllegalStateException();
    public void adiciona(T elemento) {
        if (nroElem == vetor.length) {
            throw new IllegalStateException("Lista cheia");
        }
        vetor[nroElem++] = elemento;
    }

    // 05) Método busca:
    // Recebe o elemento a ser procurado na lista
    // Retorna o índice do elemento, se for encontrado
    // Retorna -1 se não encontrou
    public int busca(T elementoBuscado) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i].equals(elementoBuscado)) {
                return i;
            }
        }
        return -1;
    }

    // 06) Método removePeloIndice:
    // Recebe o índice do elemento a ser removido
    // Se o índice for inválido, retorna false
    // Se removeu, retorna true
    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return false;
        }
        while (indice< vetor.length -1){
            vetor[indice] = vetor[indice+1];
            indice++;

        }
        nroElem --;
        return true;


    }

    // 07) Método removeElemento
    // Recebe um elemento a ser removido
    // Utiliza os métodos busca e removePeloIndice
    // Retorna false, se não encontrou o elemento
    // Retorna true, se encontrou e removeu o elemento
    public boolean removeElemento(T elementoARemover) {
int indice = busca(elementoARemover);
        if (indice == -1) {
            return false;
        }
        if (!removePeloIndice(indice)) {
            return false;
        }

        return true;
    }

    // 08) Método getTamanho
    // Retorna o tamanho da lista
    public int getTamanho() {
     return nroElem;
    }

    // 09) Método getElemento
    // Recebe um índice e retorna o elemento desse índice
    // Se o índice for inválido, retorna null
    public T getElemento(int indice) {
        if (indice >= 0 && indice < nroElem) {
            return vetor[indice];

        }
        return null;
    }

    // 10) Método limpa
    // Limpa a lista
    public void limpa() {
        nroElem = 0;

    }

    // 11) Método exibe:
    // Exibe os elementos da lista
    public void exibe() {
        for (int i = 0; i < nroElem; i++) {
            System.out.println(vetor[i]);
        }
    }

    // Get do vetor
    // Não retirar, é usado nos testes
    public T[] getVetor() {
        return vetor;
    }
}
