package com.weg.DriveFast.domain.service;

import com.weg.DriveFast.application.dto.mensagens.MensagemDTO;
import com.weg.DriveFast.application.dto.veiculo.VeiculoCreateDTO;
import com.weg.DriveFast.application.dto.veiculo.VeiculoResponseDTO;
import com.weg.DriveFast.application.dto.veiculo.VeiculoUpdateDTO;

import java.util.List;

public interface VeiculoService {
    VeiculoResponseDTO save (VeiculoCreateDTO veiculoCreateDTO);
    List<VeiculoResponseDTO> findAll();
    VeiculoResponseDTO findById(Long id);
    VeiculoResponseDTO update(Long id, VeiculoUpdateDTO veiculoUpdateDTO);
    MensagemDTO delete(Long id);
}
