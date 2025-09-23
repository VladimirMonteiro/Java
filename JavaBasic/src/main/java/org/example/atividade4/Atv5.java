package org.example.atividade4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atv5 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2025, 9, 20);
        LocalDate dataVencimento = date.plusMonths(1);
        System.out.println("Nova data de vencimento: " + dataVencimento.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}
