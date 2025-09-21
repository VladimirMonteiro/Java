package org.example.atividades2;

/*
Escreva um programa que classifique um produto em uma categoria com base em um preço e exiba a categoria correspondente,
conforme as seguintes regras:
Econômico: preço até R$ 50,00.
Intermediário: preço entre R$ 50,01 e R$ 200,00.
Premium: preço acima de R$ 200,00
*/
public class Atv6 {
    public static void main(String[] args) {
        double preco = 202.0;

        if (preco<= 50.0) {
            System.out.println("Preço econômico!");
        } else if (preco <= 200.00) {
            System.out.println("Preço intermediário!");
        } else {
            System.out.println("Preço premium!");
        }
    }
}
