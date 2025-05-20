# CadastroLivrosPOO 📚

Exercício de **Programação Orientada a Objetos (POO)** em Java.  
**IFRN - Campus Currais Novos**  
*Prof. Bruno E. G. Gomes*  
*07/03/2013*

---

## 📌 Exercícios sobre Conceitos Iniciais de POO

### 1. Diferencie o conceito de **classe** do conceito de **objeto**.
*(Resposta esperada: Definição de classe como modelo/template e objeto como instância concreta.)*

### 2. O que é um **método construtor**? Toda classe deve ter um método construtor? *(Justifique)*.
*(Resposta esperada: Explicação sobre inicialização de objetos e se há construtores padrão.)*

### 3. Qual(is) a(s) vantagem(ens) de declarar um atributo como `private`?
*(Resposta esperada: Encapsulamento, controle de acesso e segurança.)*

### 4. Todo método declarado em uma classe deve ser `public`? *(Justifique)*.
*(Resposta esperada: Discussão sobre encapsulamento e métodos internos.)*

---

## 🛠️ Implementação da Classe `Livro`

### 📋 Atributos da Classe `Livro` (todos `private`):

| Atributo         | Tipo     | Validação               |
|------------------|----------|-------------------------|
| `isbn`           | String   | 13 dígitos (`validarIsbn`) |
| `nome`           | String   | -                       |
| `anoPublicacao`  | int      | ≤ 2013 (`validarAno`)   |
| `autor`          | `Autor`  | -                       |
| `editora`        | `Editora`| -                       |

### 🔧 Métodos:
- **Getters e Setters** públicos para todos os atributos.
- Validações:
  - ISBN deve ter 13 dígitos.
  - Ano de publicação ≤ 2013.

### 🏗️ Construtores:
1. **Construtor vazio**: Inicializa atributos com valores padrão.
2. **Construtor completo**: Recebe todos os dados necessários.

---

## 🧩 Classes Adicionais

### 👨‍💻 Classe `Autor` (`private`):
| Atributo          | Tipo     | Validação               |
|-------------------|----------|-------------------------|
| `nome`            | String   | -                       |
| `dataNascimento`  | String   | -                       |
| `cpf`             | String   | -                       |
| `endereco`        | String   | -                       |

### 🏢 Classe `Editora` (`private`):
| Atributo          | Tipo     | Validação               |
|-------------------|----------|-------------------------|
| `nome`            | String   | -                       |
| `cidade`          | String   | -                       |
| `cnpj`            | String   | -                       |
| `endereco`        | String   | -                       |
| `telefone`        | String   | -                       |

**Métodos**: Getters e Setters públicos para ambas as classes.

---

## 🖥️ Classe `Main`

| Componente        | Tipo/Retorno     | Descrição               |
|-------------------|------------------|-------------------------|
| `scanner`         | `Scanner`        | Leitura de inputs       |
| `opcao`           | `int`            | Seleção do menu (1-3)   |
| `livro`           | `Livro`          | Contêiner principal     |

**Fluxo Principal**:
1. Exibe menu interativo
2. Valida entradas (ISBN 13 dígitos, ano ≤ 2013)
3. Instancia `Autor`, `Editora` e `Livro`
4. Gerencia coleção via `AdicionarLivro()`

## ▶️ Como Executar

```bash
javac POOLivro/Main.java
java POOLivro.Main
```
## 🖱️ Menu do Sistema

```text
==== MENU ====
1. Inserir livro
2. Listar livros
3. Sair
```
## 📊 Exemplo de Saída

```bash
---- Livros Cadastrados ----
ISBN: 9788535911233
Título: Dom Casmurro
Ano: 1899
Autor: Machado de Assis
CPF: 123.456.789-00
Editora: Companhia das Letras
CNPJ: 12.345.678/0001-99
Telefone: (11) 9876-5432
