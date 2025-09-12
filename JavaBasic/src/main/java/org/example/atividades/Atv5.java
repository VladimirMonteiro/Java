package org.example.atividades;

import java.util.Locale;
import java.util.Scanner;

/*Declare uma variável do tipo double valorEmDolares.
Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais.
Realize a conversão do valor em dólares para reais e imprima o resultado formatado.*/
public class Atv5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor em dolares: ");
        double valorEmDolares = scanner.nextDouble();

        System.out.printf("%.2f dólares em real é de: %.2f", valorEmDolares, valorEmDolares * 4.94);

        scanner.close();
    }
}
