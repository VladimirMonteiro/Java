package org.example.atividades;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
Crie um menu que oferece duas opções ao usuário:
1.Calcular área do quadrado.
2.Calcular área do círculo.
Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
*/
public class Atv9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        String options = """
                1 - Calcular área do quadrado.
                2 - Calcular área do circulo.
                """;

        do {
            System.out.println(options);
            System.out.print("Informe uma opsção: ");
            int option = scanner.hasNextInt() ? scanner.nextInt() : 0;
            try {
                if (option == 1) {
                    System.out.print("Informe valor de x: ");
                    double x = scanner.nextDouble();
                    System.out.print("Informe valor de y: ");
                    double y = scanner.nextDouble();
                    scanner.nextLine(); // limpa buffer
                    System.out.printf("Resultado: %.2f", areaSquare(x, y));
                    System.out.println();
                } else if (option == 2) {
                    System.out.print("Informe o valor do raio: ");
                    double r = scanner.nextDouble();
                    System.out.printf("Resultado: %.2f", areaCircle(r));
                    System.out.println();
                    scanner.nextLine();
                } else {
                    System.out.println("Opsção inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida.");
            }
            System.out.print("deseja continuar[s/n]? ");
            String exit = scanner.nextLine();

            if (exit.equalsIgnoreCase("n")) {
                loop = false;
            }
        } while (loop);
        scanner.close();
    }

    public static Double areaSquare(Double x, Double y) {
        return x * y;
    }

    public static Double areaCircle(Double r) {
        return Math.PI * Math.pow(r, 2);
    }
}
