package org.example.atividades2;

/*Escreva um programa que armazene em variáveis as informações de um livro e com base na categoria armazenada exiba
 uma mensagem de confirmação de acordo com o que foi escolhido.*/
public class Atv5 {
    public static void main(String[] args) {


        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int paginas = 96;
        double preco = 39.90;
        char categoria = 'F';

        String categoriaDescricao;

        if (categoria == 'F') {
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N') {
            categoriaDescricao = "Não-ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao = "História";
        } else {
            categoriaDescricao = "Categoria inválida";
        }

        System.out.println("Livro cadastrado: \"" + titulo + "\", de "
                + autor + ". Ele possui " + paginas + " páginas, custa R$" +
                preco + " e pertence à categoria " + categoriaDescricao + ".");
    }
}
