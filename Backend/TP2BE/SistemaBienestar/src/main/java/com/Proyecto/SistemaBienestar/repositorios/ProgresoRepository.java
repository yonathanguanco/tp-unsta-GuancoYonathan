package com.Proyecto.SistemaBienestar.repositorios;
import com.Proyecto.SistemaBienestar.models.Progreso;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgresoRepository extends MongoRepository<Progreso, String> {
}
