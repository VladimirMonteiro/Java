package org.example.atividades;

import java.util.Scanner;

/*
Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
*/
public class Atv12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();
        for (int i = (number - 1); i > 1; i--) {
            number *= i;
            if (i == 2) {
                System.out.println(number);
            }
        }
        scanner.close();
    }
}
