package com.example.SistemaAprendisaje.services;

import com.example.SistemaAprendisaje.models.Curso;
import com.example.SistemaAprendisaje.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    // Obtener todos los cursos
    public List<Curso> obtenerTodosLosCursos() {
        return cursoRepository.findAll();
    }

    // Obtener un curso por su id
    public Optional<Curso> obtenerCursoPorId(String idCurso) {
        return cursoRepository.findById(idCurso);
    }
// Crear un nuevo curso
    public Curso crearCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    // Actualizar un curso
    public Curso actualizarCurso(String idCurso, Curso cursoActualizado) {
        return cursoRepository.findById(idCurso).map(curso -> {
            curso.setNombre(cursoActualizado.getNombre());
            curso.setDescripcion(cursoActualizado.getDescripcion());
            curso.setInstructor(cursoActualizado.getInstructor());
            curso.setModulos(cursoActualizado.getModulos());
            return cursoRepository.save(curso);
        }).orElse(null); 
    }

    // Eliminar un curso
    public void eliminarCurso(String idCurso) {  
        cursoRepository.deleteById(idCurso);
    }
}
