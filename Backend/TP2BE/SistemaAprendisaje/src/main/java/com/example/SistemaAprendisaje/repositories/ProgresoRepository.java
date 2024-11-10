package com.example.SistemaAprendisaje.repositories;

import com.example.SistemaAprendisaje.models.Progreso;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgresoRepository extends MongoRepository<Progreso, String> {
}