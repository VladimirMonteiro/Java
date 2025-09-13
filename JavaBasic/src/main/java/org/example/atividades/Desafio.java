package org.example.atividades;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int sortedNumber = new Random().nextInt(100);
        int effortNumbers = 5;
        int number = 0;

        while (effortNumbers != 0) {
            System.out.printf("Tente adivinhar o número [Tentativa %d]: ", effortNumbers);
            number = scanner.nextInt();

            if (number < sortedNumber) {
                System.out.printf("%d é menor que o número sortiado.", number);
            } else if (number > sortedNumber) {
                System.out.printf("%d é maior que o número sortiado.", number);
            } else {
                System.out.println("Você acertou!!");
                break;
            }

            effortNumbers--;
        }

        System.out.println("\nNúmero sorteado: " + sortedNumber);

        scanner.close();
    }
}
