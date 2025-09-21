package org.example.atividades3;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Atv07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Informe a medida do primeiro lado: ");
            double x = scanner.nextDouble();
            System.out.println("Informe a medida do segundo lado: ");
            double y = scanner.nextDouble();
            System.out.println("Informe a medida do terceiro lado: ");
            double z = scanner.nextDouble();

            if ((x + y) > z || (x + z) > y || (y + z) > x)  {
                System.out.println("Os lados podem formar um triângulo. \n");
            } else {
                System.out.println("Não é possivel formar um triângulo");
            }

        } catch (InputMismatchException e) {
            System.out.println("Número inválido.");
        }
        scanner.close();
    }
}
