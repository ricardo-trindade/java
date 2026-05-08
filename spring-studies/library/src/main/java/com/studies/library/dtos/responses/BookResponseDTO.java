package com.studies.library.dtos.responses;

import com.studies.library.enums.Status;
import java.util.UUID;

// O que o usuário vai pode ver
public record BookResponseDTO(
        UUID id,
        String title,
        String author,
        Status status
    ) {
}
