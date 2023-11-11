package com.santamarta.cashcraft.model.dto.dtomapper;

import com.santamarta.cashcraft.model.Categoria;
import com.santamarta.cashcraft.model.dto.CategoriaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoriaMapper {
    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);
    CategoriaDTO toDTO(Categoria categoria);
    List<CategoriaDTO> toDTOList(List<Categoria> categorias);
    Categoria toEntity(CategoriaDTO categoriaDTO);
}
