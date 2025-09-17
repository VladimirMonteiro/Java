package org.example.atividades;

/*
Desenvolva uma classe Produto com os atributos privados nome e preco.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
*/
public class Produto {
    private String nome;
    private double preco;
    private double quantiity;

    public Produto(String nome, double preco, double quantiity) {
        this.nome = nome;
        this.preco = preco;
        this.quantiity = quantiity;
    }

    public void aplicarDesconto(double porcentual) {
        preco -= (porcentual/ 100) * preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantiity=" + quantiity +
                '}';
    }
}
