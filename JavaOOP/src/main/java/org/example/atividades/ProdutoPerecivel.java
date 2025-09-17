package org.example.atividades;

import java.util.Date;

public class ProdutoPerecivel extends Produto{
    private Date dataValidade;

    public ProdutoPerecivel(String nome, double preco, double quantiity, Date dataValidade) {
        super(nome, preco, quantiity);
        this.dataValidade = dataValidade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "dataValidade=" + dataValidade +
                "} " + super.toString();
    }
}
