package org.example.atividade4;

import java.time.Duration;
import java.time.LocalTime;

public class Atv3 {
    public static void main(String[] args) {

        LocalTime h1 = LocalTime.of(19, 40);
        LocalTime h2 = LocalTime.of(21, 0);
        Duration duration = Duration.between(h1, h2);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println("Diferença de tempo: " + duration.toHours() + " horas e " + duration.toMinutesPart());
    }
}
