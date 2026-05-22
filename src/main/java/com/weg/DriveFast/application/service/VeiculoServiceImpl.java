package com.weg.DriveFast.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.weg.DriveFast.application.dto.mensagens.MensagemDTO;
import com.weg.DriveFast.application.dto.veiculo.VeiculoCreateDTO;
import com.weg.DriveFast.application.dto.veiculo.VeiculoResponseDTO;
import com.weg.DriveFast.application.dto.veiculo.VeiculoUpdateDTO;
import com.weg.DriveFast.application.mapper.VeiculoMapper;
import com.weg.DriveFast.domain.Veiculo;
import com.weg.DriveFast.domain.service.VeiculoService;
import com.weg.DriveFast.infra.repository.VeiculoRepositoryJpa;

@Service
public class VeiculoServiceImpl implements VeiculoService{

    private final VeiculoRepositoryJpa veiculoRepositoryJpa;
    private final VeiculoMapper veiculoMapper;

    public VeiculoServiceImpl(VeiculoMapper veiculoMapper, VeiculoRepositoryJpa veiculoRepositoryJpa) {
        this.veiculoMapper = veiculoMapper;
        this.veiculoRepositoryJpa = veiculoRepositoryJpa;
    }


    @Override
    public VeiculoResponseDTO save(VeiculoCreateDTO veiculoCreateDTO) {

        Veiculo veiculo = veiculoMapper.toEntity(veiculoCreateDTO);

        veiculoRepositoryJpa.save(veiculo);

        return veiculoMapper.toResponseDTO(veiculo);
    }

    @Override
    public List<VeiculoResponseDTO> findAll() {
        return veiculoRepositoryJpa.findAll()
            .stream()
            .map(veiculoMapper::toResponseDTO)
            .toList();
    }

    @Override
    public VeiculoResponseDTO findById(Long id) {

        Veiculo veiculo = veiculoRepositoryJpa.findById(id)
                            .orElseThrow(() -> new RuntimeException("Erro ao buscar por id do veiculo"));

        if(veiculo.getId() == null){
            throw new RuntimeException("O id do veiculo nao pode ser nulo!");
        }

        return veiculoMapper.toResponseDTO(veiculo);
    }

    @Override
    public VeiculoResponseDTO update(Long id, VeiculoUpdateDTO veiculoUpdateDTO) {

        Veiculo veiculo = veiculoRepositoryJpa.findById(id)
                            .orElseThrow(() -> new RuntimeException("Erro ao buscar por id do veiculo"));

        if(veiculo.getId() == null){
            throw new RuntimeException("O id do veiculo nao pode ser nulo!");
        }

        veiculo.setValorDiaria(veiculoUpdateDTO.valorDiaria());

        veiculoRepositoryJpa.save(veiculo);

        return veiculoMapper.toResponseDTO(veiculo);
    }

    @Override
    public MensagemDTO delete(Long id) {

        Veiculo veiculo = veiculoRepositoryJpa.findById(id)
                            .orElseThrow(() -> new RuntimeException("Erro ao buscar por id do veiculo"));

        if(veiculo.getId() == null){
            throw new RuntimeException("O id do veiculo nao pode ser nulo!");
        }

        veiculoRepositoryJpa.delete(veiculo);

        return new MensagemDTO("Sucesso ao deletar veiculo!");
    }

    
}
