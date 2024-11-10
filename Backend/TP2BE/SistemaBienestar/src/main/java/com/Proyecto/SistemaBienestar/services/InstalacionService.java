package com.Proyecto.SistemaBienestar.services;
import com.Proyecto.SistemaBienestar.models.Instalacion;
import com.Proyecto.SistemaBienestar.repositorios.InstalacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstalacionService {

    @Autowired
    private InstalacionRepository instalacionRepository;

    public Instalacion crearInstalacion(Instalacion instalacion) {
        return instalacionRepository.save(instalacion);
    }

    public List<Instalacion> obtenerInstalaciones() {
        return instalacionRepository.findAll();
    }

    public Optional<Instalacion> obtenerInstalacionPorId(String id) {
        return instalacionRepository.findById(id);
    }

    public void eliminarInstalacion(String id) {
        instalacionRepository.deleteById(id);
    }
}
