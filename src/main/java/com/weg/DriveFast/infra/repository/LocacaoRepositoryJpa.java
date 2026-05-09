package com.weg.DriveFast.infra.repository;

import com.weg.DriveFast.domain.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocacaoRepositoryJpa extends JpaRepository<Locacao, Long> {

    @Query("""
            SELECT l
            FROM Locacao l
            WHERE l.cliente.id = :cliente_id
                """)
    List<Locacao> findAllByClienteId(@Param("cliente_id") Long clienteId);
}
