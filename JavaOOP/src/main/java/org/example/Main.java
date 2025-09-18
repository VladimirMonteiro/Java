package org.example;


import org.example.atividades.*;
import org.example.atividades.atv1.Circulo;
import org.example.atividades.atv1.Forma;
import org.example.atividades.atv1.Quadrado;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        // Atividade 2
//        System.out.println("Resultado atividade 2");
//        IdadePessoa ip = new IdadePessoa();
//        ip.setIdade(9);
//        ip.verificarIdade();
//
//        // Atividade 3
//        System.out.println("Resultado ativdade 3");
//        Produto produto = new Produto();
//        produto.setPreco(100);
//        produto.aplicarDesconto(10);
//        System.out.println(produto.getPreco());
//
//        // Atividade 4
//        System.out.println("Resultado atividade 4");
//        Aluno aluno = new Aluno();
//        aluno.setNota1(10);
//        aluno.setNota2(10);
//
//        // Atividade 5
//        ConversorMoeda conversorMoeda = new ConversorMoeda();
//        System.out.println(conversorMoeda.converterDolarParaReal(5));

//        // Atividade 6
//        CalculadoraSalaRetangular c1 = new CalculadoraSalaRetangular();
//        System.out.println(c1.calcularArea(5,5));
//        System.out.println(c1.calcularPerimetro(5,5));

        var filme1 = new Filme("Top gun: Maverick", 2021);
        var filme2 = new Filme("Avatar", 2023);
        var filmes = new ArrayList<Filme>();
        filmes.add(filme1);
        filmes.add(filme2);

        System.out.println(filmes);

        var p1 = new Pessoa();
        p1.setNome("Fernando");
        p1.setIdade(20);

        var p2 = new Pessoa();
        p2.setNome("Alberto");
        p2.setIdade(11);

        var p3 = new Pessoa();
        p3.setNome("Lara");
        p3.setIdade(24);

        var listaDePessoas = new ArrayList<Pessoa>();
        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);
        System.out.printf("Quantidade de pesosas %d\n", listaDePessoas.size());
        System.out.printf("Primeira pessoa da lista: %s%n", listaDePessoas.getFirst());
        listaDePessoas.forEach(System.out::println);

        var produto1 = new Produto("Mause", 20.00, 10);
        var produtos = new ArrayList<Produto>();
        produtos.add(produto1);
        produtos.getFirst();
        var proPerecivel = new ProdutoPerecivel("comida", 200, 10, new Date());
        System.out.println(proPerecivel);

        System.out.println("\n");
        var figuras = new ArrayList<Forma>();
        figuras.add(new Quadrado(10, 10));
        figuras.add(new Quadrado( 2, 3));
        figuras.add(new Circulo(10));
        figuras.add(new Circulo(3));
        figuras.forEach(figura -> System.out.printf("%.2f\n", figura.calcularArea()));

        List<String> nomes = new ArrayList<>();
        nomes.add("Vladimir");
        nomes.add("Pedro");
        nomes.add("Fernando");
        nomes.add("Ana");

        Collections.sort(nomes);
        System.out.println(nomes);

      filmes.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(filmes);
    }
}