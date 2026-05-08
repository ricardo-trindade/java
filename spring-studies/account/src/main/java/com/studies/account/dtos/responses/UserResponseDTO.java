package com.studies.account.dtos.responses;

import com.studies.account.entities.User;
import com.studies.account.enums.Status;

import java.time.LocalDate;

public record UserResponseDTO(
    String nome,
    String email,
    LocalDate aniversario,
    LocalDate dataCriacao,
    Status status
    ) {

    public UserResponseDTO(User user) {
        this(
                user.getNome(),
                user.getEmail(),
                user.getAniversario(),
                user.getDataCriacao(),
                user.getStatus()
        );
    }
}
