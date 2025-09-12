package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é p screen Match");
        int anoLancamento = 2022;
        System.out.println("Ano lançamento é de " + anoLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);

        String sinopse;

        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de Lançamento
                """ + anoLancamento;

        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) media / 2;

        // Formatando Strings com metodo format()
       /* String name = "Maria";
        int age = 25;
        double price = 52.5;
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais%n", name, age, price);*/

    }
}