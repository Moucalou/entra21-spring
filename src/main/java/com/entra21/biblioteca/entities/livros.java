package com.entra21.biblioteca.entities;

public class livros {

    private Integer id;
    private String nome;
    private Double preco;

    public livros(String nome, Integer id, Double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
}
