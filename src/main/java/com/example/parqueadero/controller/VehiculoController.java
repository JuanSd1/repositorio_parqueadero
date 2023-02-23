package com.example.parqueadero.controller;

import com.example.parqueadero.entity.Vehiculo;
import com.example.parqueadero.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class VehiculoController {

    @Autowired
    private VehiculoRepository vehiculoRepository;
    @GetMapping("/vehiculos")
    public List<Vehiculo> listarVehiculos(){
        return vehiculoRepository.findAll();
    }
}
