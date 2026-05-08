package com.weg.DriveFast.application.dto.locacao;

import java.math.BigDecimal;

public record LocacaoResponseDTO(
        Long id,
        int dias,
        BigDecimal valorTotal,
        String nomeCliente,
        String modeloVeiculo
) {
}
