package org.example.atividades;

import java.util.Locale;
import java.util.Scanner;

/*Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo",
caso contrário, exiba "Número negativo".
 */
public class Atv7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");

        if (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            if (number > 0) {
                System.out.println("Número posivivo.");
            } else {
                System.out.println("Número negativo.");
            }
        } else {
            System.out.println("Número inválido");
        }

        scanner.close();
    }
}
