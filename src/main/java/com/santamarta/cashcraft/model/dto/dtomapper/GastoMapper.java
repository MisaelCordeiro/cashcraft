package com.santamarta.cashcraft.model.dto.dtomapper;

import com.santamarta.cashcraft.model.Gasto;
import com.santamarta.cashcraft.model.dto.GastoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface GastoMapper {
    GastoMapper INSTANCE = Mappers.getMapper(GastoMapper.class);
    GastoDTO toDTO(Gasto gasto);
    List<GastoDTO> toDTOList(List<Gasto> gastos);

    Gasto toEntity(GastoDTO gastoDTO);
}
