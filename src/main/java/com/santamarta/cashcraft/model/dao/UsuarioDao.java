package com.santamarta.cashcraft.model.dao;

import com.santamarta.cashcraft.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Integer> {
}
