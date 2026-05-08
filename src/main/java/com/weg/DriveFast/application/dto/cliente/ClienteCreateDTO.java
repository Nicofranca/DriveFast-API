package com.weg.DriveFast.application.dto.cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public record ClienteCreateDTO(

        @NotNull
        String nome,
        @NotNull
        @Size(min = 11)
        String cnh,
        @NotNull
        @Email
        String email
) {
}
