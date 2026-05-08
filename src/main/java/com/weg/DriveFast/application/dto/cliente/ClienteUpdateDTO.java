package com.weg.DriveFast.application.dto.cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record ClienteUpdateDTO(
        @NotNull
        String nome,
        @NotNull
        @Email
        String email
) {
}
