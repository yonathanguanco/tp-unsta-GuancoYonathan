package com.example.SistemaAprendisaje.controllers;

import com.example.SistemaAprendisaje.models.Curso;
import com.example.SistemaAprendisaje.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cursos")  //llamamos ala API en postman
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping //solicitamos todos los cursos ej: /api/cursos
    public ResponseEntity<List<Curso>> obtenerTodosLosCursos() {
        List<Curso> cursos = cursoService.obtenerTodosLosCursos();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }

    @GetMapping("/{id}") //solicitamos un curso por su id ej: /api/cursos/1
    public ResponseEntity<Curso> obtenerCursoPorId(@PathVariable String id) {
        Optional<Curso> curso = cursoService.obtenerCursoPorId(id);
        return curso.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping //creamos un curso EJ: /api/cursos
    public ResponseEntity<Curso> crearCurso(@RequestBody Curso curso) {
        Curso nuevoCurso = cursoService.crearCurso(curso);
        return new ResponseEntity<>(nuevoCurso, HttpStatus.CREATED);
    }

    @PutMapping("/{id}") //actualizamos un curso EJ: /api/cursos/1
    public ResponseEntity<Curso> actualizarCurso(@PathVariable String id, @RequestBody Curso cursoActualizado) {
        Curso curso = cursoService.actualizarCurso(id, cursoActualizado);
        if (curso != null) {
            return new ResponseEntity<>(curso, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}") //eliminamos un curso por su id ej: /api/cursos/1
    public ResponseEntity<Void> eliminarCurso(@PathVariable String id) {
        cursoService.eliminarCurso(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}