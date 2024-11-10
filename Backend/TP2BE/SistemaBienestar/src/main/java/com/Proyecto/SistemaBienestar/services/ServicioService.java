package com.Proyecto.SistemaBienestar.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Proyecto.SistemaBienestar.models.Servicio;
import com.Proyecto.SistemaBienestar.repositorios.ServicioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    public Servicio crearServicio(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    public List<Servicio> obtenerServicios() {
        return servicioRepository.findAll();
    }

    public Optional<Servicio> obtenerServicioPorId(String id) {
        return servicioRepository.findById(id);
    }

    public void eliminarServicio(String id) {
        servicioRepository.deleteById(id);
    }
}
