package org.example.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Crie um programa que solicite ao usuário a entrada de um número inteiro.
Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
*/
public class Atv11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        try {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Este número é par.");
            } else {
                System.out.println("Este número é impar.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input inválido.");
        }
    }
}
