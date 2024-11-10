package com.Proyecto.SistemaBienestar.repositorios;
import com.Proyecto.SistemaBienestar.models.Servicio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepository extends MongoRepository<Servicio, String> {
}
