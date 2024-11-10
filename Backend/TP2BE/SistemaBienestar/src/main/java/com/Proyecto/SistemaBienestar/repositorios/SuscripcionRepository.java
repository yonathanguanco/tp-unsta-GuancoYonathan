package com.Proyecto.SistemaBienestar.repositorios;
import com.Proyecto.SistemaBienestar.models.Suscripcion;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuscripcionRepository extends MongoRepository<Suscripcion, String> {
    List<Suscripcion> findByIdMiembro(String idMiembro);
}
