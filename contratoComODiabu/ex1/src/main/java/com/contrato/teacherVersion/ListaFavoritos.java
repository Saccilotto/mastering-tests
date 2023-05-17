package com.contrato.teacherVersion;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class ListaFavoritos{
    private Set<Livro> favoritos;
    
    public ListaFavoritos(){
        favoritos = new HashSet<>();
    }

    public boolean check(Livro livro){
        assert livro != null : "check: parametro nulo";
        assert !isEmpty() : "check: Lista vazia";
        return favoritos.contains(livro);
    }

    public boolean isEmpty(){
        return favoritos.size() == 0;
    }

    public int size(){
        return favoritos.size();
    }

    public void add(Livro livro) {
        assert livro != null : "add: parametro nulo";
        assert !favoritos.contains(livro) : "add: livro duplicado";
        favoritos.add(livro);
        assert favoritos.contains(livro) : "add : livro não inserido";
    }

    private boolean temDuplicados(Set<Livro> novos){
        Set<Livro> aux = new HashSet<>(favoritos);
        aux.retainAll(novos);
        return aux.size() != 0;
    }

    public void merge(List<Livro> lst) {
        assert lst != null : "merge: lista nula";
        assert !temDuplicados(new HashSet<Livro>(lst)) : "merge: tem duplicados na lista informada";
        favoritos.addAll(lst);
        assert favoritos.containsAll(lst) : "merge: não adicionou direito";
    }
    
    public void remove(Livro livro) {
        assert livro != null : "remove: parametro nulo";
        assert favoritos.contains(livro) : "remove: livro inexistente";
        favoritos.remove(livro);
        assert !favoritos.contains(livro) : "remove: livro não removido";
    }

    public List<Livro> favoritos(){
        assert !favoritos.isEmpty() : "favoritos: lista vazia";
        return new LinkedList<>(favoritos);
    }
  }
  