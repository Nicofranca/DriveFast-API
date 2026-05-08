package com.weg.DriveFast.application.mapper;

import com.weg.DriveFast.application.dto.locacao.LocacaoResponseDTO;
import com.weg.DriveFast.domain.Locacao;
import org.springframework.stereotype.Component;

@Component
public class LocacaoMapper {
    public LocacaoResponseDTO toResponseDTO(Locacao locacao){
        return new LocacaoResponseDTO(
                locacao.getId(),
                locacao.getDias(),
                locacao.getValorTotal(),
                locacao.getCliente().getNome(),
                locacao.getVeiculo().getModelo()
        );
    }
}
