package com.santamarta.cashcraft.controller;

import com.santamarta.cashcraft.api.ICategoriaService;
import com.santamarta.cashcraft.model.dto.CategoriaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    ICategoriaService categoriaService;

    @GetMapping
    public String testController() { return "Controller Works!";}

    @PostMapping(value = "/get")
    public CategoriaDTO queryCategoria(@RequestBody CategoriaDTO categoriaDTO){
        return this.categoriaService.queryCategoria(categoriaDTO);
    }

    @GetMapping(value = "/getAll")
    public List<CategoriaDTO> queryAllCategorias(){
        return this.categoriaService.queryAllCategorias();
    }

    @PostMapping(value = "/add")
    public int insertCategoria(@RequestBody CategoriaDTO categoriaDTO){
        return this.categoriaService.insertCategoria(categoriaDTO);
    }

    @PutMapping(value = "/update")
    public int updateCategoria(@RequestBody CategoriaDTO categoriaDTO){
        return this.categoriaService.updateCategoria(categoriaDTO);
    }

    @DeleteMapping(value = "/delete")
    public int deleteCategoria(@RequestBody CategoriaDTO categoriaDTO){
        return this.categoriaService.deleteCategoria(categoriaDTO);
    }
}
