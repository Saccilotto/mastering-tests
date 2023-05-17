package com.contrato.teacherVersion;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String args[]){
        ListaFavoritos lista = new ListaFavoritos();

        Livro l1 = new Livro("Torto arado","Itamar Vieira Junior");
        Livro l2 = new Livro("Trilha sonora para o fim dos tempos","Antony Marra");
        Livro l3 = new Livro("O brilho do Amanha","Ismael Beah");

        //System.out.println(lista.check(l1));

        List<Livro> aux = new ArrayList<>();
        //aux.add(l1);
        aux.add(l2);
        aux.add(l3);

        lista.add(l1);
        lista.merge(aux);
        System.out.println(lista.favoritos());
    }
}
