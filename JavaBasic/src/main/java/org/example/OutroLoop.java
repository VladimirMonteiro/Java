package org.example;

import java.util.Locale;
import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double mediaAvalicacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.print("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = scanner.nextDouble();
            mediaAvalicacao = nota != -1 ? mediaAvalicacao += nota : mediaAvalicacao;

            totalDeNotas++;
        }
        System.out.printf("Média de avaliaçoes: %.2f ", mediaAvalicacao / totalDeNotas);

        scanner.close();
    }
}
