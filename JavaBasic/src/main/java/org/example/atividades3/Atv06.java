package org.example.atividades3;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Atv06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o valor do emprestimo: ");
            double price = scanner.nextDouble();

            if (price > 1000 && price < 5000) {
                System.out.println("Emprestimo realizado com sucesso!");
            } else {
                System.out.printf("O valor R$%.2f não está dentro do intervalo permitido para empréstimo. \n", price);
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido.");
        }

        scanner.close();
    }
}
