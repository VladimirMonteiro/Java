package org.example;

public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2021;
        double notaDoFilme = 8.1;

        // If else ternário -> retorna valores
        String msg = anoLancamento >= 2022 ? "Filme lançamento" : "Filme legado";
        System.out.println(msg);
    }
}
