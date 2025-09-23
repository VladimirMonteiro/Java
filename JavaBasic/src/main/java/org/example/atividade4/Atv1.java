package org.example.atividade4;

import java.time.LocalDate;
import java.time.LocalTime;


public class Atv1 {
    public static void main(String[] args) {
        String tarefa = "Enviar relatório semanal ";

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Tarefa" + tarefa + "-> realizada com sucesso!");
        System.out.println("Data: " + date);
        System.out.println("Horário: " + time);
    }
}
