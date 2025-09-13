package org.example.atividades;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais,
diferentes, o primeiro é maior ou o segundo é maior.
*/
public class Atv8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Informe o primeiro número: ");
            int n1 = scanner.nextInt();

            System.out.print("Informe o segundo número: ");
            int n2 = scanner.nextInt();

            if (n1 > n2) {
                System.out.printf("%d é o número maior.", n1);
            } else if (n2 > n1) {
                System.out.printf("%d é o número maior.", n2);
            } else {
                System.out.println("Os números são iguais.");
            }
        } catch (InputMismatchException error) {
            System.out.println("Número inválido.");
        }

        scanner.close();
    }
}
