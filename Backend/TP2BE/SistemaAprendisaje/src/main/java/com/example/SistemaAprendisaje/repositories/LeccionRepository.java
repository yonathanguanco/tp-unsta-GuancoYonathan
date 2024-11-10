package com.example.SistemaAprendisaje.repositories;

import com.example.SistemaAprendisaje.models.Leccion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeccionRepository extends MongoRepository<Leccion, String> {
}