package org.example;


import org.example.atividades.IdadePessoa;
import org.example.atividades.Produto;

public class Main {
    public static void main(String[] args) {
        // Atividade 2
        System.out.println("Resultado atividade 2");
        IdadePessoa ip = new IdadePessoa();
        ip.setIdade(9);
        ip.verificarIdade();

        // Atividade 3
        System.out.println("Resultado ativdade 3");
        Produto produto = new Produto();
        produto.setPreco(100);
        produto.aplicarDesconto(10);
        System.out.println(produto.getPreco());
    }
}