package com.santamarta.cashcraft.controller;

import com.santamarta.cashcraft.api.IUsuarioService;
import com.santamarta.cashcraft.model.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    IUsuarioService usuarioService;

    @PostMapping(value = "/get")
    public UsuarioDTO queryUsuario(@RequestBody UsuarioDTO usuarioDTO){
        return this.usuarioService.queryUsuario(usuarioDTO);
    }

    @GetMapping(value = "/getAll")
    public List<UsuarioDTO> queryAllUsuarios(){ return this.usuarioService.queryAllUsuarios(); }

    @PostMapping(value = "/add")
    public int insertUsuario(@RequestBody UsuarioDTO usuarioDTO){
        return this.usuarioService.insertUsuario(usuarioDTO);
    }

    @PutMapping(value = "/update")
    public int updateUsuario(@RequestBody UsuarioDTO usuarioDTO){
        return this.usuarioService.updateUsuario(usuarioDTO);
    }

    @DeleteMapping(value = "/delete")
    public int deleteUsuario(@RequestBody UsuarioDTO usuarioDTO){
        return this.usuarioService.deleteUsuario(usuarioDTO);
    }
}
