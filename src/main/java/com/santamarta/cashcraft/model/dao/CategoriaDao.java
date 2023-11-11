package com.santamarta.cashcraft.model.dao;

import com.santamarta.cashcraft.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Integer> {
}
