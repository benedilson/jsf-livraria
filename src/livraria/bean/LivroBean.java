package livraria.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class LivroBean {

	private Livro livro = new Livro();
	private Autor autor = new Autor();
	
	List<String> autores = new ArrayList<String>();
	
	public List<String> getAutores() {
		return this.autores;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void gravarLivro() {
		System.out.println("Gravando livro: \n" 
	+ "Titulo = " + this.livro.titulo + "\n"
	+ "ISBN = " + this.livro.isbn + "\n"
	+ "Preço = " + String.valueOf(this.livro.preco) + "\n"
	+ "Data de Lançamento = " + this.livro.dataLancamento + "\n"
	+ "Autores = " + this.autores);
	
	}
	
	public void gravarAutor() {
		autores.add(autor.nome);
	}
	
}
