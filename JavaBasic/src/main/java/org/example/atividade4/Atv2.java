package org.example.atividade4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Atv2 {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("HH:mm");

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Data: " + date.format(fmt1));
        System.out.println("Horário: " + time.format(fmt2));
    }
}
