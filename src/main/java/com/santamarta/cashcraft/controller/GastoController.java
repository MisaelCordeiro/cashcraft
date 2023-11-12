package com.santamarta.cashcraft.controller;


import com.santamarta.cashcraft.api.IGastoService;
import com.santamarta.cashcraft.model.dto.GastoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gastos")
public class GastoController {
    @Autowired
    IGastoService gastoService;

    @GetMapping
    public String testController(){
        return "Gasto controller works!";
    }

    @PostMapping
    public String testController(@RequestBody String name){
        return "Gasto controller works!, " + name;
    }

    @GetMapping(value = "/testMethod")
    public String testControllerMethod(){
        return "Gasto controller method works!";
    }

    @PostMapping(value = "/get")
    public GastoDTO queryGasto(@RequestBody GastoDTO gastoDTO){
        return this.gastoService.queryGasto(gastoDTO);
    }

    @GetMapping(value = "/getAll")
    public List<GastoDTO> queryAllGastos(){
        return this.gastoService.queryAllGastos();
    }

    @PostMapping(value = "/add")
    public int insertGasto(@RequestBody GastoDTO gastoDTO){
        return this.gastoService.insertGasto(gastoDTO);
    }

    @PutMapping(value = "/update")
    public int updateGasto(@RequestBody GastoDTO gastoDTO){
        return this.gastoService.updateGasto(gastoDTO);
    }

    @DeleteMapping (value = "/delete")
    public int deleteGasto(@RequestBody GastoDTO gastoDTO){
        return this.gastoService.deleteGasto(gastoDTO);
    }
}
