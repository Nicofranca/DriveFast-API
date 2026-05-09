package com.weg.DriveFast.infra.repository;

import com.weg.DriveFast.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepositoryJpa extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByDisponivel(Boolean disponivel);
}
