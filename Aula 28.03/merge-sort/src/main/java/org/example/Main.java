package org.example;

import java.util.Arrays;

public class Main {
    public static void intercala(int p, int q, int r, int[] v) {
        /* 1a metade do vetor v[ p ... q-1] */
        /* 2a metade do vetor v[ q ... r-1] */
        int i, j, k, w[] = new int[r - p];
        /* criar vetor auxiliar w de tamanho r-p */
        i = p;
        j = q;
        k = 0;
        while ((i < q) && (j < r)) {

            if (v[i] <= v[j]) {
                w[k++] = v[i++];
            } else {
                w[k++] = v[j++];
            }
        }
        while (i < q) {
            w[k++] = v[i++];
        }
        while (j < r) {
            w[k++] = v[j++];
        }
        for (i = p; i < r; i++) {
            v[i] = w[i - p];
        }
    }


    public static void mergeSort(int p, int r, int[] v) {
        // p = indice inicial do vetor
        // r= indice final +1
        // vetorv[p......r-1]
        if (p < r - 1) {

            int q = (p + r) / 2;// q= indice meio
            mergeSort(p, q, v);//ordena 1° metade
            mergeSort(q, r, v);//ordena 2° metade
            intercala(p, q, r, v);
        }
    }

    public static void quickSort(int[] v) {
        particiona(v, 0, v.length-1);
    }
    public static void particiona(int[] v, int indInicio, int indFim) {
        int i, j, pivo;
        i = indInicio;
        j = indFim;
        pivo = v[(indInicio + indFim) / 2];
        while (i <= j) {
            while (i < indFim && v[i] < pivo) {
                i++;
            }
            while (j > indInicio && v[j] > pivo) {
                j--;
            }
            if (i <= j) {
                int troca = v[i];
                v[i] = v[j];
                v[j] = troca;
              i=i+1;
                j=j-1;
            }
        }
        if (indInicio < j)
            particiona(v, indInicio, j);
        if (i < indFim)
            particiona(v, i, indFim);

    }

    public static void quickSortPivoFim(int[] v) {
        particionaPivoFim(v, 0, v.length-1);
    }
    public static void particionaPivoFim(int[] v, int indInicio, int indFim) {
        int i, j, pivo;
        i = indInicio;
        j = indFim;
        pivo = v[indFim];
        for (j = indFim - 1; j > indInicio; j--) {
            if (v[j] > pivo) {
                i = i - 1;
                int troca = v[j];
                v[j] = v[i];
                v[i] = troca;
            }
        }
        if (indInicio < i) {
            particionaPivoFim(v,indInicio,i-1);}
        if (i < indFim) {
            particionaPivoFim(v,i+1,indFim);

        }

    }

    public static void main(String[] args) {
        int[] v = {1, 5, 3, 73, 8, 8, 80, 29};
        mergeSort(0, v.length, v);
        System.out.println(Arrays.toString(v));
        System.out.println("QuickSort");
        quickSort(v);
        System.out.println(Arrays.toString(v));
        System.out.println("QuickSortPivoFim");
        quickSortPivoFim(v);
        System.out.println(Arrays.toString(v));
    }
}