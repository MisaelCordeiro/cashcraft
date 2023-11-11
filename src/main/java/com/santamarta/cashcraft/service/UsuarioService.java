package com.santamarta.cashcraft.service;

import com.santamarta.cashcraft.api.IUsuarioService;
import com.santamarta.cashcraft.model.Usuario;
import com.santamarta.cashcraft.model.dao.UsuarioDao;
import com.santamarta.cashcraft.model.dto.UsuarioDTO;
import com.santamarta.cashcraft.model.dto.dtomapper.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UsuarioService")
@Lazy
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public UsuarioDTO queryUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = UsuarioMapper.INSTANCE.toEntity(usuarioDTO);
        return UsuarioMapper.INSTANCE.toDTO(usuarioDao.getReferenceById(usuario.getId()));
    }

    @Override
    public List<UsuarioDTO> queryAllUsuarios(){
        return UsuarioMapper.INSTANCE.toDTOList(this.usuarioDao.findAll());
    }

    @Override
    public int insertUsuario(UsuarioDTO usuarioDTO){

        Usuario usuario = UsuarioMapper.INSTANCE.toEntity(usuarioDTO);
        this.usuarioDao.saveAndFlush(usuario);
        return usuario.getId();
    }

    @Override
    public int updateUsuario (UsuarioDTO usuarioDTO) {return insertUsuario(usuarioDTO);}

    @Override
    public int deleteUsuario (UsuarioDTO usuarioDTO){
        int id = usuarioDTO.getId();
        Usuario usuario = UsuarioMapper.INSTANCE.toEntity(usuarioDTO);
        usuarioDao.delete(usuario);
        return id;
    }

}
