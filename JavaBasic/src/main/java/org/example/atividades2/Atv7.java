package org.example.atividades2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Escreva um programa que classifique um número e exiba uma mensagem informando se o número é par ou ímpar.*/
public class Atv7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe um número inteiro: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Número: " + number + " é par!");
            } else {
                System.out.println("Número: " + number + " é impar!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Número inválido! Finalizando o programa...");

        }


        scanner.close();
    }
}
