package com.example.SistemaAprendisaje.services;

import com.example.SistemaAprendisaje.models.Progreso;
import com.example.SistemaAprendisaje.repositories.ProgresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgresoService {

    @Autowired
    private ProgresoRepository progresoRepository;

    public List<Progreso> obtenerTodosLosProgresos() {
        return progresoRepository.findAll();
    }

    public Optional<Progreso> obtenerProgresoPorId(String id) {
        return progresoRepository.findById(id);
    }

    public Progreso crearProgreso(Progreso progreso) {
        return progresoRepository.save(progreso);
    }

    public Progreso actualizarProgreso(String id, Progreso progresoActualizado) {
        Optional<Progreso> progresoExistente = progresoRepository.findById(id);
        if (progresoExistente.isPresent()) {
            progresoActualizado.setIdProgreso(id);
            return progresoRepository.save(progresoActualizado);
        }
        return null;
    }

    public void eliminarProgreso(String id) {
        progresoRepository.deleteById(id);
    }
}
