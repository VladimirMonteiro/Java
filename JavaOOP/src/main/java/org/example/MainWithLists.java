package org.example;

import org.example.atividades.Filme;
import org.example.atividades.Serie;
import org.example.atividades.Titulo;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        var FilmeDoPaulo = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        var listaDeAssistidos = new ArrayList<Titulo>();
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);

        for (Titulo item: listaDeAssistidos) {
            if (item instanceof Filme filme) {
                System.out.println("Filme: " + filme.getNome());
            } else {
                System.out.println("Serie: " + meuFilme.getNome());
            }
        }
    }
}
