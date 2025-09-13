package org.example.atividades;

import java.util.Locale;
import java.util.Scanner;

/*
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
*/
public class Atv10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double number = scanner.hasNextDouble() ? scanner.nextDouble() : 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%.1f x %d = %.1f\n", number, i, number * i);

        }

        scanner.close();
    }
}
