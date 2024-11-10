package com.Proyecto.SistemaBienestar.repositorios;
import com.Proyecto.SistemaBienestar.models.Recomendacion;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecomendacionRepository extends MongoRepository<Recomendacion, String> {
}
