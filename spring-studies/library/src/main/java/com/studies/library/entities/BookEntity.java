package com.studies.library.entities;

import com.studies.library.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor // Cria construtores com argumentos
@NoArgsConstructor // Cria construtores vazios
@Entity // Indica uma entidade
@Table(name = "books") // Indica uma tabela no banco de dados
public class BookEntity {

    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto inserção
    private UUID bookId;

    private String title;
    private String author;

    // "unique = true" indica que não pode ter outro dado igual
    @Column(unique = true)
    private String isbn;

    @NotNull
    private LocalDate registrationDate;

    @NotNull
    private Status status;
}
