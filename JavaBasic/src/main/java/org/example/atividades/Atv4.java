package org.example.atividades;

/*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.*/
public class Atv4 {
    public static void main(String[] args) {
        double precoProduto = 59.99;
        int quantidade = 6;

        System.out.printf("Preço total do produto: %.2f", precoProduto * quantidade);
    }
}
