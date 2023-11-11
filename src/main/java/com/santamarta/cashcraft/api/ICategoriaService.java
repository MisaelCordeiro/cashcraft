package com.santamarta.cashcraft.api;

import com.santamarta.cashcraft.model.dto.CategoriaDTO;

import java.util.List;

public interface ICategoriaService {
    CategoriaDTO queryCategoria (CategoriaDTO categoriaDTO);
    List<CategoriaDTO> queryAllCategorias();

    int insertCategoria(CategoriaDTO categoriaDTO);
    int updateCategoria(CategoriaDTO categoriaDTO);
    int deleteCategoria(CategoriaDTO categoriaDTO);
}
