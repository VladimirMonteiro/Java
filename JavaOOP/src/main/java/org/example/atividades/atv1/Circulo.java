package org.example.atividades.atv1;

public class Circulo implements Forma{
    private double r;

    public Circulo(double r) {
        this.r = r;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "r=" + r +
                '}';
    }
}
