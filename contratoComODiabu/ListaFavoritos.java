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
	} 

	public void merge(List<Livro> lst2) {
		assert !lst2.stream().allMatch((l) -> lst.contains(l));
		lst.addAll(lst2);
	}

	public void remove(Livro l) {
		lst.remove(l);
	} 

	public List<Livro> favoritos() {
		return lst;
	}  
}