package com.studies.store.dtos.requests;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record ProductRequestDTO (
        @NotBlank String nome,
        @NotBlank BigDecimal preco,
        @NotBlank Integer estoque
    ) {
}
