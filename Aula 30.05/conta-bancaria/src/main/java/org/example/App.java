package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PilhaObj<Operacao> pilhaOperacoes = new PilhaObj<>(10);
        FilaObj<Operacao> filaOperacoes = new FilaObj<>(10);
        int contadorOperacoes = 0;

        ContaBancaria conta1 = new ContaBancaria(1, 1000.0);
        ContaBancaria conta2 = new ContaBancaria(2, 2000.0);

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1- Debitar valor");
            System.out.println("2- Creditar (Depositar) valor");
            System.out.println("3- Desfazer operação");
            System.out.println("4- Agendar operação");
            System.out.println("5- Executar operações agendadas");
            System.out.println("6- Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número da conta:");
                    int numeroContaDebito = scanner.nextInt();
                    System.out.println("Digite o valor a ser debitado:");
                    double valorDebito = scanner.nextDouble();
                    ContaBancaria contaDebito = (numeroContaDebito == conta1.getNumero()) ? conta1 : conta2;
                    if (contaDebito.debitar(valorDebito)) {
                        pilhaOperacoes.push(new Operacao(contaDebito, "debito", valorDebito));
                        contadorOperacoes++;
                    }
                    break;
                case 2:
                    System.out.println("Digite o número da conta:");
                    int numeroContaCredito = scanner.nextInt();
                    System.out.println("Digite o valor a ser creditado:");
                    double valorCredito = scanner.nextDouble();
                    ContaBancaria contaCredito = (numeroContaCredito == conta1.getNumero()) ? conta1 : conta2;
                    contaCredito.creditar(valorCredito);
                    pilhaOperacoes.push(new Operacao(contaCredito, "credito", valorCredito));
                    contadorOperacoes++;
                    break;
                case 3:
                    System.out.println("Digite a quantidade de operações a serem desfeitas:");
                    int quantidadeDesfazer = scanner.nextInt();
                    if (quantidadeDesfazer > contadorOperacoes) {
                        System.out.println("Quantidade inválida");
                    } else {
                        for (int i = 0; i < quantidadeDesfazer; i++) {
                            Operacao operacaoDesfazer = pilhaOperacoes.pop();
                            if (operacaoDesfazer.getTipoOperacao().equals("debito")) {
                                operacaoDesfazer.getObjConta().creditar(operacaoDesfazer.getValor());
                            } else {
                                operacaoDesfazer.getObjConta().debitar(operacaoDesfazer.getValor());
                            }
                            contadorOperacoes--;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o tipo de operação (debito ou credito):");
                    String tipoOperacao = scanner.next();
                    System.out.println("Digite o número da conta:");
                    int numeroContaOperacao = scanner.nextInt();
                    System.out.println("Digite o valor da operação:");
                    double valorOperacao = scanner.nextDouble();
                    ContaBancaria contaOperacao = (numeroContaOperacao == conta1.getNumero()) ? conta1 : conta2;
                    filaOperacoes.enqueue(new Operacao(contaOperacao, tipoOperacao, valorOperacao));
                    break;
                case 5:
                    if (filaOperacoes.isEmpty()) {
                        System.out.println("Não há operações agendadas");
                    } else {
                        while (!filaOperacoes.isEmpty()) {
                            Operacao operacaoExecutar = filaOperacoes.dequeue();
                            if (operacaoExecutar.getTipoOperacao().equals("debito")) {
                                operacaoExecutar.getObjConta().debitar(operacaoExecutar.getValor());
                            } else {
                                operacaoExecutar.getObjConta().creditar(operacaoExecutar.getValor());
                            }
                        }
                    }
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}