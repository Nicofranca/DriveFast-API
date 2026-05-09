package com.weg.DriveFast.infra.repository.projections;

import java.math.BigDecimal;

public interface ClienteGastoProjection {
    String getNomeCliente();
    BigDecimal getTotalGasto();
}
