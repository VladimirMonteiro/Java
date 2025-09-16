package org.example.atividades;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public double calcularArea(double x, double y) {
        return  x * y;
    }

    @Override
    public double calcularPerimetro(double x, double y) {
        return (2 * y) + (2 * x);
    }
}
