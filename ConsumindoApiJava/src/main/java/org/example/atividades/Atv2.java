package org.example.atividades;

import org.example.atividades.exceptions.SenhaInvalidaException;

import java.util.Scanner;

/*
Crie um programa que lê uma senha do usuário.
Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException,
uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos
(por exemplo, ter pelo menos 8 caracteres).
*/
public class Atv2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        try{
            System.out.println("Infome uma senha válida: ");
            String password = scanner.nextLine();

            if (password.length() < 8) {
                throw new SenhaInvalidaException("A senha precisa ter no minímo 8 caracteres.");
            }
            System.out.println("Senha criada com sucesso!");

        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
