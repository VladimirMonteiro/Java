package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Vladimir", "Pedro", "Nora", "Richerth");
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Lorenço");
        namesMap.put(2, "Dias");
        namesMap.put(3, "Carla");

        namesMap.forEach((index, name) -> System.out.println(index + " " + name ));
    }
}