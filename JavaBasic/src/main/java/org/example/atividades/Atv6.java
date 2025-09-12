package org.example.atividades;

/*Declare uma variável do tipo double precoOriginal.
Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida,
declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto
(por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o
ao preço original e imprima o novo preço com desconto.*/
public class Atv6 {
    public static void main(String[] args) {
        double precoOriginal = 19.99;
        double porcentualDesconto = 0.1;

        System.out.printf("Preço orinal: R$%.2f. Preço com desconto é de: R$%.2f", precoOriginal,
                precoOriginal -precoOriginal * porcentualDesconto);
    }
}
