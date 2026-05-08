package com.studies.news.dtos.requests;

import jakarta.validation.constraints.NotBlank;

public record NewsRequestDTO(
        @NotBlank String titulo,
        @NotBlank String subtitulo,
        @NotBlank String conteudo,
        @NotBlank String autor,
        @NotBlank String categoria
) {
}
