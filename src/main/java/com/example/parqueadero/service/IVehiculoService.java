package com.example.parqueadero.service;

import com.example.parqueadero.entity.Vehiculo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IVehiculoService {

    List<Vehiculo> listarVehiculos();
}
