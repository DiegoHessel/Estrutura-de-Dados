package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ArquivoCsv {
    public static void gravarArquivoCsv(List<Heroi> lista, String nomeArquivo) {
        FileWriter arquivo = null;
        Formatter saida = null;
        Boolean deuRuim = false;
        nomeArquivo += ".csv";

        try {
            arquivo = new FileWriter(nomeArquivo);
            saida = new Formatter(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }

        try {
            for (Heroi heroi : lista) {
                saida.format("%d;%s;%.2f;%d;%.2f;%s;%s\n", heroi.getId(), heroi.getNome(), heroi.getPoder(), heroi.getIdade(), heroi.getForca(), heroi.getHabilidade(), heroi.getSquad());
            }
        } catch (FormatterClosedException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
            e.printStackTrace();
            deuRuim = true;
        } finally {
            saida.close();
            try {
                arquivo.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar arquivo: " + e.getMessage());
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivoCsv(String nomeArq) {
        FileReader aqr = null;
        Scanner entrada = null;
        boolean deuRuim = false;

        nomeArq += ".csv";

        try {
            aqr = new FileReader(nomeArq);
            entrada = new Scanner(aqr).useDelimiter(";|\\n");
        } catch (FileNotFoundException erro) {
            System.out.println("erro ao abrir p arquivo");
            erro.printStackTrace();
            System.exit(1);
        }
        try {
            System.out.printf("%4S;%10S;%4S;%5S;%4S;%10S;%10S\n", "id", "nome", "poder", "idade", "forca", "habilidade", "squad");
            while (entrada.hasNext()) {
                int id = entrada.nextInt();
                String nome = entrada.next();
                double poder = entrada.nextDouble();
                Integer idade = entrada.nextInt();
                double forca = entrada.nextDouble();
                String habilidade = entrada.next();
                String squad = entrada.next();

                System.out.printf("%4d;%10.10s;%.2f;%5d;%.2f;%10s;%10s\n", id, nome, poder, idade, forca, habilidade, squad);
            }
        } catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problema");
            erro.printStackTrace();
            deuRuim = true;
        } catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do aquivo");
            erro.printStackTrace();
            deuRuim = true;
        } finally {
            entrada.close();
            try {
                aqr.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar arquivo: " + e.getMessage());
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }
}
