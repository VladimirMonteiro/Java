package org.example.atividades.desafio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarrinhoCompra {

    List<Produto> products = new ArrayList<>();

    public List<Produto> getProducts() {
        return products;
    }

    public void showListBuyOrderByPrice() {
        products.sort(Comparator.comparing(Produto::getPrice));
        System.out.println("******************************************");
       if (products.isEmpty()) {
           System.out.println("Carrinho de compras vazio!");
       } else {
           products.forEach(produto -> System.out.println(produto.getName() + " - R$" + produto.getPrice()));
       }
        System.out.println("******************************************");
    }
}
