package com.Proyecto.SistemaBienestar.repositorios;
import com.Proyecto.SistemaBienestar.models.Pago;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends MongoRepository<Pago, String> {
}
