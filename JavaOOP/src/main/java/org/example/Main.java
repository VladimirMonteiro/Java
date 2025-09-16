package org.example;


import org.example.atividades.*;

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

        // Atividade 4
        System.out.println("Resultado atividade 4");
        Aluno aluno = new Aluno();
        aluno.setNota1(10);
        aluno.setNota2(10);

        // Atividade 5
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        System.out.println(conversorMoeda.converterDolarParaReal(5));

        // Atividade 6
        CalculadoraSalaRetangular c1 = new CalculadoraSalaRetangular();
        System.out.println(c1.calcularArea(5,5));
        System.out.println(c1.calcularPerimetro(5,5));


    }
}