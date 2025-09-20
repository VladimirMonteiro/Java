package org.example.atividades;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
*/
public class Atv1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Informe o númerador: ");
            double x = scanner.nextDouble();
            System.out.print("Informe o denominador: ");
            double y = scanner.nextDouble();

            if (Double.isInfinite(x / y)) {
                throw new IllegalArgumentException("Não é possível dividir por 0.");
            }

            System.out.printf("%.2f", x / y);
        } catch (IllegalArgumentException | InputMismatchException e) {
            if (e instanceof InputMismatchException) {
                System.out.println("Valor inválido");
            } else {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
