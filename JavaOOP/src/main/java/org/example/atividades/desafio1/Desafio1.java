package org.example.atividades.desafio1;

import java.util.*;

public class Desafio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        boolean menu = true;
        var compras = new CarrinhoCompra();

        System.out.print("Informe o limite do seu cartão: ");
        double limit = scanner.nextDouble();

        while (menu) {
            scanner.nextLine();
            System.out.print("Informe o nome do produto que deseja comprar: ");
            String productName = scanner.nextLine();

            System.out.print("Informe o valor do produto: ");

            double productPrice = scanner.nextDouble();

            if (productPrice > limit) {
                System.out.print("Limite insuficiente!\n");
                compras.showListBuyOrderByPrice();
                System.out.printf("Limite disponivel: R$%.2f\n", limit);
            } else {
                compras.getProducts().add(new Produto(productName, productPrice));
                limit -= productPrice;
                System.out.println("Produto adicionado no carrinho com sucesso!");
            }

            System.out.print("Deseja compra mais produtos?[s/n]: ");
            String response = scanner.next();
            System.out.println(response);
            if (Objects.equals(response, "n")) {
                compras.showListBuyOrderByPrice();
                menu = false;
                System.out.println("Todos produtos comprados");
            }
        }

        scanner.close();
    }
}
