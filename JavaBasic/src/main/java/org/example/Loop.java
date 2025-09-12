package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double mediaAvalicacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Diga sua avaliação para o filme: ");
            nota = scanner.nextDouble();
            mediaAvalicacao += nota;
        }
        System.out.printf("Média de avaliaçoes: %.2f ", mediaAvalicacao / 3);

        scanner.close();
    }
}
