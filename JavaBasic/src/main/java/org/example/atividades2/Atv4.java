package org.example.atividades2;

/*
Crie um programa que receba uma temperatura em graus Celsius (int) e exiba a temperatura convertida
 em graus Fahrenheit (double). A fórmula para conversão é Fahrenheit = (Celsius * 9 / 5) + 32:
 */
public class Atv4 {
    public static void main(String[] args) {
        int tempCelsius = 20;

        double tempFahrenheit = (tempCelsius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + tempFahrenheit);
    }
}

