package org.example.atividades;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {

    // Códigos ANSI para cores
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        double saldo = 2500.00;

        String clientData = """
                ****************************************
                Dados iniciais do cliente:
                                
                Nome: Vladimir Monteiro Souza de Lima
                Tipo de conta: Corrente
                Saldo inicial: R$%.2f
                ****************************************\n\n""";

        String options = """
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;

        do {
            System.out.printf(clientData, saldo);
            System.out.println(options);

            System.out.print("Digite a opção desejada: ");
            try {
                int selectedOption = scanner.nextInt();
                switch (selectedOption) {
                    case 1:
                        System.out.println(CYAN + "Saldo atual: R$" + saldo + RESET);
                        break;
                    case 2:
                        System.out.print("Informe o valor do depósito: ");
                        double valor = scanner.nextDouble();
                        saldo += valor;
                        System.out.println(GREEN + "Depósito realizado com sucesso!" + RESET);
                        System.out.println("Saldo atualizado para: R$" + saldo);
                        break;
                    case 3:
                        System.out.print("Informe o valor de transferência: ");
                        double transfer = scanner.nextDouble();
                        if ((saldo - transfer) < 0) {
                            System.out.println(RED + "❌ Saldo insuficiente." + RESET);
                        } else {
                            saldo -= transfer;
                            System.out.println(GREEN + "✅ Transferência realizada com sucesso!" + RESET);
                            System.out.println("Saldo atualizado para: R$" + saldo);
                        }
                        break;
                    case 4:
                        loop = false;
                        System.out.println(YELLOW + "Saindo do sistema..." + RESET);
                        break;
                    default:
                        System.out.println(RED + "⚠ Opção inválida." + RESET);
                        scanner.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println(RED + "⚠ Entrada inválida, digite apenas números." + RESET);
                scanner.nextLine(); // limpa buffer
            }
        } while (loop);

        scanner.close();
    }
}
