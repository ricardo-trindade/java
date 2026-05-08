package com.studies.library.services;

import com.studies.library.dtos.requests.BookRequestDTO;
import com.studies.library.dtos.responses.BookResponseDTO;
import com.studies.library.entities.BookEntity;
import com.studies.library.enums.Status;
import com.studies.library.repositories.BookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service // Avisa ao Spring que esta classe tem a lógica de negócio
@RequiredArgsConstructor // Cria o construtor para o Repository automaticamente (Lombok)
public class BookService {

    private final BookRepository bookRepository;

    @Transactional // Garante que, se algo der errado, nada seja salvo no banco
    public BookResponseDTO registerBook(BookRequestDTO dto) { // Método do tipo response que precisa receber um request

        // 1. A validação do isbn
        // Usamos aquele método que criamos no repository
        if (bookRepository.existsByIsbn(dto.isbn())) {
            throw new RuntimeException("Já existe um livro cadastrado com este ISBN");
        }

        // 2. Criar a Entity e "passar" os dados do DTO para ela
        BookEntity entity = new BookEntity();
        entity.setTitle(dto.title());
        entity.setAuthor(dto.author());
        entity.setIsbn(dto.isbn());

        // 3. Definir os dados que o sistema gera sozinho
        entity.setRegistrationDate(LocalDate.now());
        entity.setStatus(Status.DISPONIVEL);

        // 4. Salvar no banco
        BookEntity savedEntity = bookRepository.save(entity);

        // 5. Devolver o ResponseDTO (com o ID que o banco gerou)
        return new BookResponseDTO(
                savedEntity.getBookId(),
                savedEntity.getTitle(),
                savedEntity.getAuthor(),
                savedEntity.getStatus()
        );
    }

    public BookResponseDTO findByIsbn(String isbn) {

        // 1. Tenta buscar no banco
        BookEntity entity = bookRepository.findByIsbn(isbn).orElseThrow(() -> new RuntimeException("Livro com ISBN " + isbn + " não encontrado!"));

        // 2. Transforma a Entity achada em ResponseDTO para o usuário ver
        return new BookResponseDTO(
                entity.getBookId(),
                entity.getTitle(),
                entity.getAuthor(),
                entity.getStatus()
        );
    }

    @Transactional
    public BookResponseDTO updateBookData(UUID id, BookRequestDTO dto) {
        // 1. Busca o livro existente ou explode um erro
        BookEntity entity = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Livro não encontrado para atualizar!"));

        // 2. Se o ISBN que veio no DTO for diferente do que está no banco...
        if (!entity.getIsbn().equals(dto.isbn())) {
            // ... eu verifico se esse NOVO ISBN já não está em uso por outra pessoa
            if (bookRepository.existsByIsbn(dto.isbn())) {
                throw new RuntimeException("Este novo ISBN já está cadastrado em outro livro!");
            }
        }

        // 3. Atualiza apenas o que o usuário pode mudar
        entity.setTitle(dto.title());
        entity.setAuthor(dto.author());
        entity.setIsbn(dto.isbn());

        // 4. Salva as alterações
        BookEntity updatedEntity = bookRepository.save(entity);

        // 5. Retorna o ResponseDTO
        return new BookResponseDTO(
                updatedEntity.getBookId(),
                updatedEntity.getTitle(),
                updatedEntity.getAuthor(),
                updatedEntity.getStatus()
        );
    }

    @Transactional
    public void deleteBook(UUID id) {
        // 1. Verifica se o livro existe antes de tentar deletar
        if (!bookRepository.existsById(id)) {
            throw new RuntimeException("Não é possível deletar: Livro não encontrado!");
        }

        // 2. Apaga o registro do banco
        bookRepository.deleteById(id);

    }
}
