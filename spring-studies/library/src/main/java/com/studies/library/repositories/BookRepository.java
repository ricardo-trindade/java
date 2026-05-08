package com.studies.library.repositories;

import com.studies.library.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

/* O extends JpaRepository<BookEntity, UUID> serve para herdar todos os
métodos de CRUD (Salvar, Buscar, Deletar, Alterar) prontos, sem eu
precisar escrever nenhuma linha de SQL manualmente. */

// BookEntity: Avisa ao Spring que este repositório é responsável por gerenciar a tabela de Livros
// UUID: Avisa ao Spring que a chave primária (@Id) dessa tabela é do tipo UUID. (Se o seu ID fosse um número comum, aqui seria Long).
public interface BookRepository extends JpaRepository<BookEntity, UUID> {

    // Método de busca por isbn (personalizado)
    boolean existsByIsbn(String isbn);

    // O "Optional" é uma segurança: se não achar o livro,
    // ele retorna um objeto vazio em vez de dar erro de "NullPointerException"
    Optional<BookEntity> findByIsbn(String isbn);
}
