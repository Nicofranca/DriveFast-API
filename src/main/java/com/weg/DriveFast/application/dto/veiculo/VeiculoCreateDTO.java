package com.weg.DriveFast.application.dto.veiculo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;

import java.math.BigDecimal;

public record VeiculoCreateDTO(
        @NotNull
        String marca,
        @NotNull
        String modelo,
        @NotNull
        @Size(min = 7)
        String placa,
        @NotNull
        @Min(1)
        BigDecimal valorDiaria
) {
}
