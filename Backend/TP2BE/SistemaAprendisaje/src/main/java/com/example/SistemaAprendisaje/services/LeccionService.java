package com.example.SistemaAprendisaje.services;

import com.example.SistemaAprendisaje.models.Leccion;
import com.example.SistemaAprendisaje.repositories.LeccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeccionService {

    @Autowired
    private LeccionRepository leccionRepository;

    public List<Leccion> obtenerTodasLasLecciones() {
        return leccionRepository.findAll();
    }

    public Optional<Leccion> obtenerLeccionPorId(String idLeccion) {
        return leccionRepository.findById(idLeccion);
    }

    public Leccion crearLeccion(Leccion leccion) {
        return leccionRepository.save(leccion);
    }

    public Leccion actualizarLeccion(String idLeccion, Leccion leccionActualizada) {
        return leccionRepository.findById(idLeccion).map(leccion -> {
            leccion.setNombre(leccionActualizada.getNombre());
            leccion.setContenido(leccionActualizada.getContenido());
            leccion.setEvaluaciones(leccionActualizada.getEvaluaciones());
            return leccionRepository.save(leccion);
        }).orElse(null);
    }

    public void eliminarLeccion(String idLeccion) {
        leccionRepository.deleteById(idLeccion);
    }
}
