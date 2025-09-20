package org.example.atividades.desafio;

import java.io.IOException;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o CEP que deseja pesquisar: ");
        String cep = scanner.nextLine();
        try {
            Endereco endereco = ConsultaCep.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivo.salvaJson(endereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
