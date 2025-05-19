package POOLivro;

public class Autor {

	private String nomeAutor;
	private String dataNascimento;
	private String cpf;
	private String endereco;
	
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Autor(String nomeAutor, String dataNascimento, String cpf, String endereco) {
		this.nomeAutor = nomeAutor;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
	}
}
