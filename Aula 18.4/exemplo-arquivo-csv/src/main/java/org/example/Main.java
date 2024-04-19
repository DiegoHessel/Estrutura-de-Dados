package org.example;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();

        cachorros.add(new Cachorro(1, "Kyra", "Medio", 10.5));
        cachorros.add(new Cachorro(2, "Mel", "Medio", 15.));
        cachorros.add(new Cachorro(3, "Henrique", "Grande", 20.));
        cachorros.add(new Cachorro(4, "Amora", "Pequeno", 7.));
        cachorros.add(new Cachorro(5, "Lampião", "Pequeno", 2.));

        for (Cachorro c : cachorros) {
            System.out.println(c);
        }
        gravarArquivoCsv(cachorros, "caes");
        leExibeArquivoCsv("caes");
    }


    public static void gravarArquivoCsv(List<Cachorro> lista, String nomeArquivo) {
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

            for (Cachorro c : lista) {
                saida.format("%d;%s;%s;%.1f\n", c.getId(), c.getNome(), c.getPorte(), c.getPeso());
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
            System.out.printf("%4S %-15S %-9S %4S\n", "id", "nome", "porte", "peso");
            while (entrada.hasNext()) {
                int id = entrada.nextInt();
                String nome = entrada.next();
                String porte = entrada.next();
                Double peso = entrada.nextDouble();

                System.out.printf("%4d %-15s %-9s %4.1f\n",id,nome,porte,peso);
            }
        }
        catch (NoSuchElementException erro){
            System.out.println("Arquivo com problema");
            erro.printStackTrace();
            deuRuim = true;
        }
catch (IllegalStateException erro){
    System.out.println("Erro na leitura do aquivo");
    erro.printStackTrace();
    deuRuim= true;
}
        finally {
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