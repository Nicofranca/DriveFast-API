package com.weg.DriveFast.application.dto.veiculo;

import jakarta.validation.constraints.Min;

import java.math.BigDecimal;

public record VeiculoUpdateDTO(
        @Min(1)
        BigDecimal valorDiaria
) {
}
