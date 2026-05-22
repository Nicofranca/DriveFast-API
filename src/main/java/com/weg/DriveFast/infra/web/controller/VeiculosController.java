package com.weg.DriveFast.infra.web.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.DriveFast.application.dto.veiculo.VeiculoCreateDTO;
import com.weg.DriveFast.application.dto.veiculo.VeiculoResponseDTO;
import com.weg.DriveFast.application.dto.veiculo.VeiculoUpdateDTO;
import com.weg.DriveFast.application.service.VeiculoServiceImpl;

import org.springframework.web.bind.annotation.PutMapping;

import com.weg.DriveFast.application.dto.mensagens.MensagemDTO;




@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

    private final VeiculoServiceImpl veiculoServiceImpl;

    public VeiculosController(VeiculoServiceImpl veiculoServiceImpl) {
        this.veiculoServiceImpl = veiculoServiceImpl;
    }

    @PostMapping()
    public ResponseEntity<VeiculoResponseDTO> save (@RequestBody VeiculoCreateDTO veiculoCreateDTO){
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(veiculoServiceImpl.save(veiculoCreateDTO));
    }
    
    @GetMapping()
    public ResponseEntity<List<VeiculoResponseDTO>> findAll(){
        return ResponseEntity.status(HttpStatus.OK)
            .body(veiculoServiceImpl.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeiculoResponseDTO> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK)
            .body(veiculoServiceImpl.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VeiculoResponseDTO> update(@PathVariable Long id, @RequestBody VeiculoUpdateDTO veiculoUpdateDTO){
        return ResponseEntity.status(HttpStatus.OK)
            .body(veiculoServiceImpl.update(id, veiculoUpdateDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MensagemDTO> delete(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK)
            .body(veiculoServiceImpl.delete(id));
    }

}
