package org.example.atividades3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Marcos trabalha em uma loja e precisa verificar se um cliente tem direito a um desconto de 10% em sua compra.
O desconto é aplicado apenas se o valor da compra for maior ou igual a R$ 100,00.
Para isso, ele quer um programa que permita inserir o valor da compra e exiba se o desconto foi aplicado ou não,
juntamente com o novo valor após o desconto, caso aplicável.
Caso o valor da compra seja menor que R$ 100,00 nao será aplicado desconto de 10%
*/
public class Atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o valor da compra: ");
            double price = scanner.nextDouble();

            if (price > 100) {
                price -= price * 0.1;
                System.out.println("Desconto de 10% aplicado. ");
                System.out.println("Novo valor: R$ " + price);
            } else {
                System.out.println("Nenhum desconto aplicado. ");
                System.out.println("Valor total: R$ " + price);
            }

        } catch (InputMismatchException e) {
            System.out.println("Número inválido! Finalizando programa...");
        }

        scanner.close();
    }
}
