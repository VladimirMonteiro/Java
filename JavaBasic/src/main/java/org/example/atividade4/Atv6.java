package org.example.atividade4;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atv6 {
    public static void main(String[] args) {

        LocalDate eventDate = LocalDate.of(2025, 9, 29);
        LocalDate date = LocalDate.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Data do evento: " + eventDate.format(fmt));
        System.out.println("Data atual: " + date.format(fmt));

        if (eventDate.isBefore(date)) {
            System.out.println("Evento ja ocorreu");
        } else {
            System.out.println("Evento irá ocorrer em preve");
        }
    }
}
