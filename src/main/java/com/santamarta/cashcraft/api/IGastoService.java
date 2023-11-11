package com.santamarta.cashcraft.api;

import com.santamarta.cashcraft.model.dto.GastoDTO;

import java.util.List;

public interface IGastoService {
    GastoDTO queryGasto (GastoDTO gastoDTO);
    List<GastoDTO> queryAllGastos();

    int insertGasto(GastoDTO gastoDTO);
    int updateGasto(GastoDTO gastoDTO);
    int deleteGasto(GastoDTO gastoDTO);
}
