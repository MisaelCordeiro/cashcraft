package com.santamarta.cashcraft.service;

import com.santamarta.cashcraft.api.ICategoriaService;
import com.santamarta.cashcraft.model.Categoria;
import com.santamarta.cashcraft.model.dao.CategoriaDao;
import com.santamarta.cashcraft.model.dto.CategoriaDTO;
import com.santamarta.cashcraft.model.dto.dtomapper.CategoriaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CategoriaService")
@Lazy
public class CategoriaService implements ICategoriaService{
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public CategoriaDTO queryCategoria(CategoriaDTO categoriaDTO){
        Categoria categoria = CategoriaMapper.INSTANCE.toEntity(categoriaDTO);
        return CategoriaMapper.INSTANCE.toDTO(categoriaDao.getReferenceById(categoria.getId()));
    }

    @Override
    public List<CategoriaDTO> queryAllCategorias(){return CategoriaMapper.INSTANCE.toDTOList(categoriaDao.findAll()); }

    @Override
    public int insertCategoria(CategoriaDTO categoriaDTO){
        Categoria categoria = CategoriaMapper.INSTANCE.toEntity(categoriaDTO);
        this.categoriaDao.saveAndFlush(categoria);
        return categoria.getId();
    }

    @Override
    public int updateCategoria(CategoriaDTO categoriaDTO){
        return insertCategoria(categoriaDTO);
    }

    @Override
    public int deleteCategoria(CategoriaDTO categoriaDTO){
        int id = categoriaDTO.getId();
        Categoria categoria = CategoriaMapper.INSTANCE.toEntity(categoriaDTO);
        categoriaDao.delete(categoria);
        return id;
    }


}
