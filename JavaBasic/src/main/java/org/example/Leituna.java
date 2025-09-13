package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Leituna {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do seu filme preferido: ");
        String filme = scanner.nextLine();

        System.out.print("Informe o ano de lançamento: ");
        int anoLancamento = scanner.nextInt();

        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = scanner.nextDouble();

        System.out.println("filme");
        System.out.println("anoDeLancamento");
        System.out.println("avaliacao");



    }
}
