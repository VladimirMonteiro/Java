package org.example.atividade4;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atv4 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        int days = 15;
        LocalDate dateDelivery = date.plusDays(15);

        System.out.println("Data de entrega: " + dateDelivery.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}
