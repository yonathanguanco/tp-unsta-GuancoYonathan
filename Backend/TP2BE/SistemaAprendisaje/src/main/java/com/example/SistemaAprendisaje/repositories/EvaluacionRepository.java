package com.example.SistemaAprendisaje.repositories;

import com.example.SistemaAprendisaje.models.Evaluacion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluacionRepository extends MongoRepository<Evaluacion, String> {
}
