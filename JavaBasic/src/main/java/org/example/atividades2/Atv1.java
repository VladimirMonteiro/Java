package org.example.atividades2;

/*
Escreva um programa que declare variáveis para o seu nome, idade, altura e se você é estudante,
utilizando os tipos apropriados, e depois exiba os valores armazenados.
*/
public class Atv1 {
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 25;
        double altura = 1.68;
        boolean estudante = true;

        System.out.printf("Nome: %s\nIdade: %d\nAltura: %.2f\nÉ estudante: %b", nome, idade, altura, estudante);
    }
}
