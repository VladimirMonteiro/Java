package org.example.atividades3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe um número inteiro: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Número par");
            } else {
                System.out.println("Número impar");
            }

        } catch (InputMismatchException e) {
            System.out.println("Número invalido! Finalizando programa...");
        }




        scanner.close();
    }
}
