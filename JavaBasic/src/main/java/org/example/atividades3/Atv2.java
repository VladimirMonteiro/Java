package org.example.atividades3;

import java.util.Scanner;

/*
Ajude Jéssica a criar um programa que, com base em uma senha pré-definida, por exemplo: 123456,
verifique se o que o usuário digitou está correto ou não.
O programa deve comparar a tentativa com a senha correta e exibir se o acesso foi permitido ou negado.
*/
public class Atv2 {
    public static void main(String[] args) {
        String password = "12344";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a senha de acesso: ");
        String userPassword = scanner.nextLine();

        String response = userPassword.equals(password) ? "Acesso liberado!" : "Acesso negado!";
        System.out.println(response);

        scanner.close();
    }
}
