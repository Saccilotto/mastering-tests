package com.contrato;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Livro> aux = new ArrayList<>();
        List<Livro> trickery = null;

        ListaFavoritos lst =  new ListaFavoritos();
        Livro liv1 = new Livro("Steve Jobs", "How to Byte an Apple");
        Livro liv2 = new Livro("Jeff Bezos", "How to Establish a Monopoly");
        Livro liv3 = new Livro("Elon Musk", "How to Tell Others You Are a Superhero");
        Livro liv4 = new Livro("Carl Jung", "How to Become a Psycho");
        Livro liv5 = new Livro("Robert C.Martin", "How To Clean Your House's Architecture");
        Livro liv6 = new Livro("W.W.Atinkson", "How to Become as Full Metal Alchemist"); 
        Livro blackhole = null;

        lst.check(blackhole);

        lst.check(liv1);

        lst.add(blackhole);

        lst.add(liv1);
        lst.add(liv1);
        lst.check(liv1);

        lst.merge(trickery);

        aux.add(liv1);
        aux.add(liv2);
        aux.add(liv3);
        aux.add(liv5);
        aux.add(liv6);

        lst.merge(aux);

        aux.remove(liv1);

        lst.merge(aux);

        lst.remove(blackhole);
        lst.remove(liv4);
        lst.remove(liv3);

        aux = lst.favoritos();

        System.out.println(aux);

        lst.remove(liv2);
        lst.remove(liv1);
        lst.remove(liv5);
        lst.remove(liv6);

        aux = lst.favoritos();
    }
}