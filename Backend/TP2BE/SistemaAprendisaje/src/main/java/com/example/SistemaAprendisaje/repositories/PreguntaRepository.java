package com.example.SistemaAprendisaje.repositories;

import com.example.SistemaAprendisaje.models.Pregunta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRepository extends MongoRepository<Pregunta, String> {
}