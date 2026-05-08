package com.studies.store.dtos.responses;

import com.studies.store.entities.Product;
import com.studies.store.enums.Status;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record ProductResponseDTO(
        UUID id,
        String nome,
        BigDecimal preco,
        Integer estoque,
        Status status,
        LocalDate dataLancamento
    ) {

    public ProductResponseDTO(Product product) {
        this (
                product.getId(),
                product.getNome(),
                product.getPreco(),
                product.getEstoque(),
                product.getStatus(),
                product.getDataLancamento()
        );
    }

}
