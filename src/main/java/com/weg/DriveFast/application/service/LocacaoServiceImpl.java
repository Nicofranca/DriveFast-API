package com.weg.DriveFast.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.weg.DriveFast.application.dto.locacao.LocacaoResponseDTO;
import com.weg.DriveFast.application.dto.mensagens.MensagemDTO;
import com.weg.DriveFast.domain.service.LocacaoService;

@Service
public class LocacaoServiceImpl implements LocacaoService{

    @Override
    public LocacaoResponseDTO save(Long clienteId, Long veiculoId, int dias) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public List<LocacaoResponseDTO> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public MensagemDTO delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
