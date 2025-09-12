package org.example.atividades;

import java.util.Locale;
import java.util.Scanner;

// Crie um programa que realize a média de duas notas decimais e exiba o resultado.
public class Atv1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double n1 = scan.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double n2 = scan.nextDouble();

        double media = (n1 + n2) / 2;
        System.out.printf("Sua média é de: %.2f", media);

        scan.close();
    }
}
