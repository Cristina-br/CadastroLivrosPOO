package POOLivro;

public class Editora {

	private String nomeEditora;
	private String cidade;
	private String cnpj;
	private String enderecoEditora;
	private String telefone;
	
	public String getNomeEditora() {
		return nomeEditora;
	}
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEnderecoEditora() {
		return enderecoEditora;
	}
	public void setEnderecoEditora(String enderecoEditora) {
		this.enderecoEditora = enderecoEditora;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Editora(String nomeEditora, String cidade, String cnpj, String enderecoEditora, String telefone) {
		this.nomeEditora = nomeEditora;
		this.cidade = cidade;
		this.cnpj = cnpj;
		this.enderecoEditora= enderecoEditora;
		this.telefone = telefone;
	}
}
