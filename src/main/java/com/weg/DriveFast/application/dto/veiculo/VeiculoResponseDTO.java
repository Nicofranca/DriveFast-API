package com.weg.DriveFast.application.dto.veiculo;

import jakarta.validation.constraints.Min;

import java.math.BigDecimal;

public record VeiculoResponseDTO(
        Long id,
        String marca,
        String modelo,
        String placa,
        BigDecimal valorDiaria,
        Boolean disponivel
) {
}
