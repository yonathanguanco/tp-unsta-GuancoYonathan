package com.Proyecto.SistemaBienestar.services;
import com.Proyecto.SistemaBienestar.models.Pago;
import com.Proyecto.SistemaBienestar.repositorios.PagoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    public Pago crearPago(Pago pago) {
        return pagoRepository.save(pago);
    }

    public List<Pago> obtenerPagos() {
        return pagoRepository.findAll();
    }

    public Optional<Pago> obtenerPagoPorId(String id) {
        return pagoRepository.findById(id);
    }

    public void eliminarPago(String id) {
        pagoRepository.deleteById(id);
    }
}
