package POOLivro;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	
	private List<Livro> listaLivrosCadastrados = new ArrayList<>();
	private static int contadorId = 0;
	
	private int id;
	private String isbn;
	private String nome;
	private int anoDePublicacao;
	private Autor autor;
	private Editora editora;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Livro(String isbn, String nome, int anoDePublicacao, Autor autor, Editora editora) {
		this.id = contadorId++;
		this.isbn = isbn;
		this.nome = nome;
		this.anoDePublicacao = anoDePublicacao;
		this.autor = autor; 
		this.editora = editora;
	}
	
	public boolean validarIsbn (String isbn) {
		if (isbn.length() != 13) {
			return false;
		}
		return true;
	}
	
	public boolean validarAno (int anoDePublicacao) {
		if (anoDePublicacao <= 2013) {
			return true;
		}
		return false;
	}
	
	public void exibirLivro() {
		System.out.println("\nID: " + id);
		System.out.println("ISBN: " + isbn);
		System.out.println("Nome do livro: " + nome);
		System.out.println("Ano de publicação: " + anoDePublicacao);
		System.out.println("Nome do autor: " + autor.getNomeAutor());
		System.out.println("Data de nascimento do autor: " + autor.getDataNascimento());
		System.out.println("CPF do autor: " + autor.getCpf());
		System.out.println("Endereço do autor: " + autor.getEndereco());
		System.out.println("Nome da editora: " + editora.getNomeEditora());
		System.out.println("Cidade da editora: " + editora.getCidade());
		System.out.println("CNPJ da editora: " + editora.getCnpj());
		System.out.println("Endereço da editora: " + editora.getEnderecoEditora());
		System.out.println("Telefone da editora: " + editora.getTelefone());
	}
	
	public List<Livro> getLivro() {
		return listaLivrosCadastrados;
	}
	
	public void AdicionarLivro(Livro livro) {
		listaLivrosCadastrados.add(livro);
	}
}
