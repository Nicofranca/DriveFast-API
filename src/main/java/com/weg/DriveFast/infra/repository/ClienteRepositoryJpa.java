package com.weg.DriveFast.infra.repository;

import com.weg.DriveFast.application.dto.cliente.ClienteCreateDTO;
import com.weg.DriveFast.domain.Cliente;
import com.weg.DriveFast.infra.repository.projections.ClienteGastoProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepositoryJpa extends JpaRepository<Cliente, Long> {

    @Query(value = """
            SELECT cliente_id, SUM(valor_total) 
                    FROM locacao
                            GROUP BY cliente_id""",
            nativeQuery = true)
    List<ClienteGastoProjection> relatorioGastos();


}
