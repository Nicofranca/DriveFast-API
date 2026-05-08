package com.weg.DriveFast.application.dto.locacao;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record LocacaoCreateDTO(
        @NotNull
        Long clienteId,
        @NotNull
        Long veiculoId,
        @NotNull
        int dias
) {
}
