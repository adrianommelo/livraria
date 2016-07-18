package br.com.jsflivraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.jsflivraria.modelo.Livro;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();

	public Livro getLivro() {
		return livro;
	}
	
	public void gravar() {
		System.out.println("Gravando livro " + this.livro.getTitulo());
	}
}
