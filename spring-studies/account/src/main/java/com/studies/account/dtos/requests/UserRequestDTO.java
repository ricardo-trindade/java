package com.studies.account.dtos.requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record UserRequestDTO(
        @NotBlank String nome,
        @NotBlank @Email String email,
        @NotBlank String senha,
        @Past @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") LocalDate aniversario
    ) {
}
