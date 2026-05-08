package com.weg.DriveFast.application.mapper;

import com.weg.DriveFast.application.dto.veiculo.VeiculoCreateDTO;
import com.weg.DriveFast.application.dto.veiculo.VeiculoResponseDTO;
import com.weg.DriveFast.domain.Veiculo;
import org.springframework.stereotype.Component;

@Component
public class VeiculoMapper {

    public Veiculo toEntity(VeiculoCreateDTO veiculoCreateDTO){
        return new Veiculo(
                null,
                veiculoCreateDTO.marca(),
                veiculoCreateDTO.modelo(),
                veiculoCreateDTO.placa(),
                veiculoCreateDTO.valorDiaria(),
                true
        );
    }

    public VeiculoResponseDTO toResponseDTO(Veiculo veiculo){
        return new VeiculoResponseDTO(
                veiculo.getId(),
                veiculo.getMarca(),
                veiculo.getModelo(),
                veiculo.getPlaca(),
                veiculo.getValorDiaria(),
                veiculo.getDisponivel()
        );
    }
}
