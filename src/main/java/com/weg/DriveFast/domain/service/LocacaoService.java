package com.weg.DriveFast.domain.service;

import com.weg.DriveFast.application.dto.locacao.LocacaoResponseDTO;
import com.weg.DriveFast.application.dto.mensagens.MensagemDTO;

import java.util.List;

public interface LocacaoService {
    LocacaoResponseDTO save (Long clienteId, Long veiculoId, int dias);
    List<LocacaoResponseDTO> findAll();
    MensagemDTO delete (Long id);
}
