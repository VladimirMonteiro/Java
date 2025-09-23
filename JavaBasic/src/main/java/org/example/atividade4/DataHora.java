package org.example.atividade4;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {
//      Operações importantes com data-hora

//      Instanciação
//      1. (Agora) -> Data-Hora
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d02 = " + d03);

//      1.1 Texto ISO 8601 -> Data-Hora
        LocalDate d04 = LocalDate.parse("2025-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-07-20T01:30:26");
        Instant d06 = Instant.parse("2025-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2025-07-20T01:30:26-03:00");
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);

//      1.2  Texto formatato customizado -> Data-Hora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate d08 = LocalDate.parse("20/07/2025", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2025 01:30", fmt2);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);

//      1.3  dia, mes, ano, [horário] -> data-hora local

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 1, 20, 23, 22, 0);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

//      Formatação
//      2  * Data-hora -> Texto formatto customizado
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        LocalDate d12 = LocalDate.parse("2025-09-20");
        LocalDateTime d13 = LocalDateTime.parse("2025-09-20T20:30:20");
        Instant d14 = Instant.parse("2025-09-20T20:30:20Z");

        System.out.println("d12 = " + d12.format(fmt3));
        System.out.println("d12 = " + fmt3.format(d12));
        System.out.println("d13 = " + fmt4.format(d13));
        System.out.println("d14 = " + fmt5.format(d14));

//      Converter data-hora global para local

//      3 Data-hora global, timezone (sistema local)  -> Data-hora local
        LocalDate r1 = LocalDate.ofInstant(d14, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(d14, ZoneId.systemDefault());
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

//      3.1  Obter dados de uma data-hora local > dia, mês, ano, horário

        System.out.println("d12 dia = " + d12.getDayOfMonth());
        System.out.println("d12 mês = " + d12.getMonthValue());
        System.out.println("d12 ano = " + d12.getYear());
        System.out.println("d13 hora = " + d13.getHour());
        System.out.println("d13 hora = " + d13.getMinute());

    }
}

