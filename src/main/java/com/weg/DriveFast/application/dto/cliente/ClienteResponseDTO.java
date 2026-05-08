package com.weg.DriveFast.application.dto.cliente;

public record ClienteResponseDTO(
        Long id,
        String nome,
        String cnh,
        String email
) {
}
