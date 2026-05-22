package com.weg.DriveFast.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.weg.DriveFast.application.dto.cliente.ClienteCreateDTO;
import com.weg.DriveFast.application.dto.cliente.ClienteResponseDTO;
import com.weg.DriveFast.application.dto.cliente.ClienteUpdateDTO;
import com.weg.DriveFast.application.dto.mensagens.MensagemDTO;
import com.weg.DriveFast.application.mapper.ClienteMapper;
import com.weg.DriveFast.domain.Cliente;
import com.weg.DriveFast.domain.service.ClienteService;
import com.weg.DriveFast.infra.repository.ClienteRepositoryJpa;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepositoryJpa clienteRepositoryJpa;
    private final ClienteMapper clienteMapper;

    public ClienteServiceImpl(ClienteMapper clienteMapper, ClienteRepositoryJpa clienteRepositoryJpa) {
        this.clienteMapper = clienteMapper;
        this.clienteRepositoryJpa = clienteRepositoryJpa;
    }



    @Override
    public ClienteResponseDTO save(ClienteCreateDTO clienteCreateDTO) {

        Cliente cliente = clienteMapper.toEntity(clienteCreateDTO);

        if(cliente == null){
            throw new RuntimeException("Cliente não pode ser nulo!");
        }

        clienteRepositoryJpa.save(cliente);

        return clienteMapper.toResponseDto(cliente);
    }

    @Override
    public List<ClienteResponseDTO> findAll() {
        return clienteRepositoryJpa.findAll()
        .stream()
        .map(clienteMapper::toResponseDto)
        .toList();
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
