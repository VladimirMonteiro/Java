package org.example.atividades3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros,
 compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.
 */
public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe um número: ");
            int number1 = scanner.nextInt();

            System.out.println("Informe o segundo número: ");
            int number2 = scanner.nextInt();

            if (number1 > number2) {
                System.out.println("O maior número é: " + number1);
            } else {
                System.out.println("O maior número é: " + number2);
            }
        } catch (InputMismatchException e) {
            System.out.println("Número inválido! Finalizando programa.");
        }
        scanner.close();
    }
}
