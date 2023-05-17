package com.contrato;

import java.util.ArrayList;
import java.util.List;

public class ListaFavoritos { 
    List<Livro> lst;

    ListaFavoritos() {
        lst = new ArrayList<Livro>();
    }

 	public boolean check(Livro l) {
		assert l != null : "Livro Nulo";
		assert size() != 0 : "Lista Vazia";
        return lst.contains(l);
	}  

	public boolean isEmpty() {
		return lst.isEmpty();
	} 

	public int size() {
		return lst.size();
	} 

 	public void add(Livro l) {
		assert l != null : "Livro Nulo";
		assert !lst.contains(l) : "Livro já está presente na lista";
		lst.add(l);
		assert lst.contains(l) : "Livro não foi inserido na lista";
	} 

	public void merge(List<Livro> lst2) {
		assert lst2 != null : "A lista a ser adicionado aos favoritos é nula";
		assert !lst2.stream().allMatch((l) -> lst.contains(l)) : "Há item(s) duplicados na lista informada";
		lst.addAll(lst2);
		assert lst.containsAll(lst2);
	}

	public void remove(Livro l) {
		assert l != null : "Remove : O livro é nulo";
		assert lst.contains(l) : "O livro a ser removido não está presente na lista";
		lst.remove(l);
		assert !lst.contains(l) : "O livro não foi removido.";
	} 

	public List<Livro> favoritos() {
		assert !lst.isEmpty(): "A lista está vazia.";
		return lst;
	}  
}