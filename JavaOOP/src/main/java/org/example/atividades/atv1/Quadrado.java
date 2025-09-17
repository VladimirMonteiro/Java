package org.example.atividades.atv1;

public class Quadrado implements Forma {
    private double x;
    private double y;

    public Quadrado(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calcularArea() {
        return x * y;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
