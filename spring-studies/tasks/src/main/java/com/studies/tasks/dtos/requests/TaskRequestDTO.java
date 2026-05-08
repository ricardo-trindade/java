package com.studies.tasks.dtos.requests;

import jakarta.validation.constraints.NotBlank;

public record TaskRequestDTO(
        @NotBlank String titulo,
        @NotBlank String descricao
) {
}
