package com.weg.DriveFast.domain.service;

import com.weg.DriveFast.application.dto.cliente.ClienteCreateDTO;
import com.weg.DriveFast.application.dto.cliente.ClienteResponseDTO;
import com.weg.DriveFast.application.dto.cliente.ClienteUpdateDTO;
import com.weg.DriveFast.application.dto.mensagens.MensagemDTO;

import java.util.List;

public interface ClienteService {
    ClienteResponseDTO save (ClienteCreateDTO clienteCreateDTO);
    List<ClienteResponseDTO> findAll();
    ClienteResponseDTO findById(Long id);
    ClienteResponseDTO update(Long clienteId, ClienteUpdateDTO clienteUpdateDTO);
    MensagemDTO delete(Long id);
}
