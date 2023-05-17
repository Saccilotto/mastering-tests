package com.contrato;

public class Livro {

    private String nome;
    private String autor;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Livro: [Autor: " + autor + ". Nome: " + nome + ".]";
    }
}
