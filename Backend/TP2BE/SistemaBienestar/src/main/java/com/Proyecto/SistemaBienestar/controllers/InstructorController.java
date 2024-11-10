
package com.Proyecto.SistemaBienestar.controllers;
import com.Proyecto.SistemaBienestar.models.Instructor;
import com.Proyecto.SistemaBienestar.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructores") // esto es  la url de la api 
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @PostMapping // crea un nuevo instructor
    public ResponseEntity<Instructor> crearInstructor(@RequestBody Instructor instructor) {
        Instructor nuevoInstructor = instructorService.crearInstructor(instructor);
        return ResponseEntity.ok(nuevoInstructor);
    }

    @GetMapping
    public ResponseEntity<List<Instructor>> obtenerInstructores() {
        List<Instructor> instructores = instructorService.obtenerInstructores();
        return ResponseEntity.ok(instructores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Instructor> obtenerInstructorPorId(@PathVariable String id) {
        return instructorService.obtenerInstructorPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarInstructor(@PathVariable String id) {
        instructorService.eliminarInstructor(id);
        return ResponseEntity.noContent().build();
    }
}
