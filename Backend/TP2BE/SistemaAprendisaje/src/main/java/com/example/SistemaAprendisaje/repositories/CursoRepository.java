package com.example.SistemaAprendisaje.repositories;

import com.example.SistemaAprendisaje.models.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// Repositorio de cursos
@Repository
public interface CursoRepository extends MongoRepository<Curso, String> {
}