package com.example.SistemaAprendisaje.repositories;

import com.example.SistemaAprendisaje.models.Modulo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuloRepository extends MongoRepository<Modulo, String> {
}
