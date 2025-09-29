# Biblioteca Java - Projeto de Gerenciamento de Livros

*Descrição*

Este projeto é uma aplicação simples em Java para gerenciar uma biblioteca de livros. Permite cadastrar, listar, buscar e remover livros utilizando uma interface de linha de comando (CLI). O objetivo é praticar conceitos de programação orientada a objetos, manipulação de listas e interação com o usuário via console.

---

*Funcionalidades*

- *Cadastrar livro:* Permite adicionar um novo livro informando título, autor, ano e ISBN.
- *Listar livros:* Exibe todos os livros cadastrados na biblioteca.
- *Buscar livros:* Permite buscar livros por título ou autor, com busca parcial (contém).
- *Remover livro:* Remove um livro da biblioteca pelo ISBN informado.
- *Interface simples:* Menu interativo via console para facilitar o uso.

---

*Estrutura do Código*

*Classes principais*

- *Main:*  
  Classe principal que contém o método `main` e controla o fluxo da aplicação, exibindo o menu e capturando as opções do usuário.

- *Library:*  
  Classe que gerencia a coleção de livros (`List<Book>`), com métodos para adicionar, listar, buscar e remover livros.

- *Book:*  
  Classe que representa um livro, com atributos `title`, `author`, `year` e `isbn`, além dos métodos getters e `toString()` para exibição.

---

*Detalhes da Implementação*

- A lista de livros é mantida na classe `Library` como um `ArrayList<Book>`.
- Os métodos de busca (`searchByTitle` e `searchByAuthor`) realizam buscas case-insensitive e parciais.
- A remoção é feita pelo ISBN, utilizando o método `removeIf` da lista.
- A interface no `Main` utiliza `Scanner` para entrada de dados e `System.out` para saída.
- O código está organizado para facilitar manutenção e futuras melhorias.

