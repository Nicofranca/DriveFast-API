package com.weg.DriveFast.infra.web.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.DriveFast.application.dto.cliente.ClienteCreateDTO;
import com.weg.DriveFast.application.dto.cliente.ClienteResponseDTO;
import com.weg.DriveFast.application.dto.cliente.ClienteUpdateDTO;
import com.weg.DriveFast.application.dto.mensagens.MensagemDTO;
import com.weg.DriveFast.domain.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping()
    public ResponseEntity<ClienteResponseDTO> save (@RequestBody ClienteCreateDTO clienteCreateDTO){
        return ResponseEntity.status(HttpStatus.CREATED).
            body(clienteService.save(clienteCreateDTO));
    }

    @GetMapping()
    public ResponseEntity<List<ClienteResponseDTO>> findAll(){
        return ResponseEntity.status(HttpStatus.OK)
            .body(clienteService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponseDTO> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK)
            .body(clienteService.findById(id));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ClienteResponseDTO> update(@PathVariable Long id, @RequestBody ClienteUpdateDTO clienteUpdateDTO){
        return ResponseEntity.status(HttpStatus.OK)
            .body(clienteService.update(id, clienteUpdateDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MensagemDTO> delete(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK)
            .body(clienteService.delete(id));
    }
}
