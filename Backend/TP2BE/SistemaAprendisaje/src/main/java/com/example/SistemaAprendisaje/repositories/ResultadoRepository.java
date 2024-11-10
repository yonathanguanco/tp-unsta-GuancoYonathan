package com.example.SistemaAprendisaje.repositories;

import com.example.SistemaAprendisaje.models.Resultado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResultadoRepository extends MongoRepository<Resultado, String> {
}
