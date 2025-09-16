package org.example.atividades;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public double converterDolarParaReal(double dolar) {
        return 4.75 * dolar;
    }
}
