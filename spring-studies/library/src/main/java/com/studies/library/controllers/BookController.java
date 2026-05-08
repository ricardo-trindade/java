package com.studies.library.controllers;

import com.studies.library.dtos.requests.BookRequestDTO;
import com.studies.library.dtos.responses.BookResponseDTO;
import com.studies.library.services.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController // Define que esta classe é uma API que retorna JSON
@RequestMapping("/books") // Define o "endereço" base. Ex: localhost:8080/books
@RequiredArgsConstructor // Injeta o Service automaticamente (igual fizemos no Service com o Repository)
public class BookController {

    private final BookService bookService; // O Controller precisa do Service para funcionar

    // Método Post
    @PostMapping
    // ResponseEntity: tipo de dado da resposta
    // <BookResponseDTO>: qual resposta irá retornar
    // @Valid: validar o @NotBlank, @NotNull...
    // @RequestBody: "Peguei o JSON que ele enviou"
    public ResponseEntity<BookResponseDTO> cadastrar(@RequestBody @Valid BookRequestDTO dto) {
        // response: de onde ele vai tirar a resposta
        BookResponseDTO response = bookService.registerBook(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    // Método Get
    @GetMapping("/{isbn}") // O que está entre chaves é o "apelido" do valor na URL
    public ResponseEntity<BookResponseDTO> buscarPorIsbn(@PathVariable String isbn) {
        // @PathVariable: variável de caminho
        return ResponseEntity.ok(bookService.findByIsbn(isbn));
    }

    // Método Put
    @PutMapping("/{id}")
    // @PathVariable UUID id: saber qual livro
    // @RequestBody @Valid BookRequestDTO dto: saber de onde vão vir as alterações
    public ResponseEntity<BookResponseDTO> atualizar(@PathVariable UUID id, @RequestBody @Valid BookRequestDTO dto) {
        // Resposta: atualizar livro (id do livro a ser atualizado, e dto que trasnfere as alterações
        BookResponseDTO response = bookService.updateBookData(id, dto);
        return ResponseEntity.ok(response);
    }

    // Método Delete
    @DeleteMapping("/{id}")
    // <Void>: resposta vazia
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build(); // Retorna 204 No Content (sucesso sem corpo)
    }

}
