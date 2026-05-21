package com.weg.DriveFast.application.service;

import com.weg.DriveFast.application.dto.cliente.ClienteCreateDTO;
import com.weg.DriveFast.application.dto.cliente.ClienteResponseDTO;
import com.weg.DriveFast.application.dto.cliente.ClienteUpdateDTO;
import com.weg.DriveFast.application.dto.mensagens.MensagemDTO;
import com.weg.DriveFast.domain.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Override
    public ClienteResponseDTO save(ClienteCreateDTO clienteCreateDTO) {
        return null;
    }

    @Override
    public List<ClienteResponseDTO> findAll() {
        return List.of();
    }

    @Override
    public ClienteResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public ClienteResponseDTO update(Long clienteId, ClienteUpdateDTO clienteUpdateDTO) {
        return null;
    }

    @Override
    public MensagemDTO delete(Long id) {
        return null;
    }
}
