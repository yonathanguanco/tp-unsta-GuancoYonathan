package com.Proyecto.SistemaBienestar.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Proyecto.SistemaBienestar.models.Instalacion;

@Repository
public interface InstalacionRepository extends MongoRepository<Instalacion, String> {
}
