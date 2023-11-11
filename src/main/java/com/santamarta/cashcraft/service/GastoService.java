package com.santamarta.cashcraft.service;

import com.santamarta.cashcraft.api.IGastoService;
import com.santamarta.cashcraft.model.Gasto;
import com.santamarta.cashcraft.model.dao.GastoDao;
import com.santamarta.cashcraft.model.dto.GastoDTO;
import com.santamarta.cashcraft.model.dto.dtomapper.GastoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("GastoService")
@Lazy
public class GastoService implements IGastoService {
    @Autowired
    private GastoDao gastoDao;

    @Override
    public GastoDTO queryGasto(GastoDTO gastoDTO){
        Gasto gasto = GastoMapper.INSTANCE.toEntity(gastoDTO);
        return GastoMapper.INSTANCE.toDTO(gastoDao.getReferenceById(gasto.getId()));
    }

    @Override
    public List<GastoDTO> queryAllGastos(){return GastoMapper.INSTANCE.toDTOList(gastoDao.findAll());}

    @Override
    public int insertGasto(GastoDTO gastoDTO){
        Gasto gasto = GastoMapper.INSTANCE.toEntity(gastoDTO);
        this.gastoDao.saveAndFlush(gasto);
        return gasto.getId();
    }

    @Override
    public int updateGasto (GastoDTO gastoDTO){
        return insertGasto(gastoDTO);
    }

    @Override
    public int deleteGasto(GastoDTO gastoDTO){
        int id = gastoDTO.getId();
        Gasto gasto = GastoMapper.INSTANCE.toEntity(gastoDTO);
        gastoDao.delete(gasto);
        return id;
    }

}
