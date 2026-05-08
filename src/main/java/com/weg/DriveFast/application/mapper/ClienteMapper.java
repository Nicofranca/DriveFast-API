package com.weg.DriveFast.application.mapper;

import com.weg.DriveFast.application.dto.cliente.ClienteCreateDTO;
import com.weg.DriveFast.application.dto.cliente.ClienteResponseDTO;
import com.weg.DriveFast.domain.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public Cliente toEntity(ClienteCreateDTO clienteCreateDTO){
        return new Cliente(
            null,
                clienteCreateDTO.nome(),
                clienteCreateDTO.cnh(),
                clienteCreateDTO.email()
        );
    }

    public ClienteResponseDTO toResponseDto (Cliente cliente){
        return new ClienteResponseDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getCnh(),
                cliente.getEmail()
        );
    }
}
