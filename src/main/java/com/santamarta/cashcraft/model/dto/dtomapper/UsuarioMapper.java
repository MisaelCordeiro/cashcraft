package com.santamarta.cashcraft.model.dto.dtomapper;


import com.santamarta.cashcraft.model.Usuario;
import com.santamarta.cashcraft.model.dto.UsuarioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UsuarioMapper {
    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
    UsuarioDTO toDTO(Usuario usuario);
    List<UsuarioDTO> toDTOList(List<Usuario> usuarios);
    Usuario toEntity(UsuarioDTO usuarioDTO);
}
