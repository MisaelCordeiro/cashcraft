package com.santamarta.cashcraft.model.dao;

import com.santamarta.cashcraft.model.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GastoDao extends JpaRepository<Gasto, Integer> {
}
