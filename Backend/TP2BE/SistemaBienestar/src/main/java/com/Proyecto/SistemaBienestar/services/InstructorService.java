package com.Proyecto.SistemaBienestar.services;
import com.Proyecto.SistemaBienestar.models.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import com.Proyecto.SistemaBienestar.repositorios.InstructorRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    public Instructor crearInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public List<Instructor> obtenerInstructores() {
        return instructorRepository.findAll();
    }

    public Optional<Instructor> obtenerInstructorPorId(String id) {
        return instructorRepository.findById(id);
    }

    public void eliminarInstructor(String id) {
        instructorRepository.deleteById(id);
    }
}
