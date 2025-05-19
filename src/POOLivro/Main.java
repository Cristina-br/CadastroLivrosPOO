package POOLivro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Livro livro = new Livro(null, null, 0, null, null);
		int opcao;

		do {
			System.out.println("\n==== MENU ==== \n1. Inserir livro \n2. Listar livros \n3. Sair \nEscolha uma opção:");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1 -> {
				System.out.println("Digite o nome do autor: ");
				String nomeAutor = scanner.nextLine();

				System.out.println("Digite a data de nascimento do autor: ");
				String dataNascimento = scanner.nextLine();

				System.out.println("Digite o CPF do autor: ");
				String cpf = scanner.nextLine();

				System.out.println("Digite o endereço do autor: ");
				String enderecoAutor = scanner.nextLine();

				System.out.println("Digite o nome da editora: ");
				String nomeEditora = scanner.nextLine();

				System.out.println("Digite a cidade da editora: ");
				String cidadeEditora = scanner.nextLine();

				System.out.println("Digite o CNPJ da editora: ");
				String cnpj = scanner.nextLine();

				System.out.println("Digite o endereço da editora: ");
				String enderecoEditora = scanner.nextLine();

				System.out.println("Digite o telefone da editora: ");
				String telefoneEditora = scanner.nextLine();

				System.out.println("Digite o ISBN do livro: ");
				String isbn = scanner.nextLine();
				
				if (livro.validarIsbn(isbn) == true) {
					System.out.println("Digite o nome do livro: ");
					String nomeLivro = scanner.nextLine();

					System.out.println("Digite o ano de publicação: ");
					int anoPublicacao = scanner.nextInt();
					
					if (livro.validarAno(anoPublicacao) == true) {
						Autor autor = new Autor(nomeAutor, dataNascimento, cpf, enderecoAutor);
						Editora editora = new Editora(nomeEditora, cidadeEditora, cnpj, enderecoEditora, telefoneEditora);
						Livro livroCadastrado = new Livro(isbn, nomeLivro, anoPublicacao, autor, editora);
						livro.AdicionarLivro(livroCadastrado);
						System.out.println("Livro cadastrado com sucesso");
		
					} else {
						System.err.println("O ano deve ser menor ou igual a 2013");
					}
				} else {
					System.err.println("O ISBN deve conter 13 dígitos");
				}
			}
			case 2 -> {
				System.out.println("\n ---- Livros Cadastrados ---- ");
				for (Livro l : livro.getLivro()) {
					l.exibirLivro();
				}
			}
			}
		} while (opcao != 3);

		scanner.close();
	}

}
