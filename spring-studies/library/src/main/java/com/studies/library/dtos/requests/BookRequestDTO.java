package com.studies.library.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// O que o usuário vai poder inserir
public record BookRequestDTO(
        @NotBlank
        String title,

        @NotBlank
        String author,

        @NotBlank
        @Size(min = 1, max = 100)
        String isbn
    ) {
}
