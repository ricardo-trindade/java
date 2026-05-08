package com.studies.tasks.dtos.responses;

import java.time.LocalDate;

public record TaskResponseDTO(
        String titulo,
        String descricao,
        Boolean concluida,
        LocalDate dataCriacao
) {
}
