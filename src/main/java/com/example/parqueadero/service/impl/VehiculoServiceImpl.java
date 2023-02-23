package com.example.parqueadero.service.impl;

import com.example.parqueadero.entity.Vehiculo;
import com.example.parqueadero.repository.VehiculoRepository;
import com.example.parqueadero.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;
    @Override
    public List<Vehiculo> listarVehiculos() {
        return vehiculoRepository.findAll();
    }
}
