package com.Proyecto.SistemaBienestar.services;

import com.Proyecto.SistemaBienestar.models.Reserva;
import com.Proyecto.SistemaBienestar.repositorios.ReservaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva crearReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public List<Reserva> obtenerReservas() {
        return reservaRepository.findAll();
    }

    public Optional<Reserva> obtenerReservaPorId(String id) {
        return reservaRepository.findById(id);
    }

    public void eliminarReserva(String id) {
        reservaRepository.deleteById(id);
    }

    public List<Reserva> buscarReservasPorMiembro(String idMiembro) {
        return reservaRepository.findByIdMiembro(idMiembro);
    }

    public List<Reserva> buscarReservasPorInstructor(String idInstructor) {
        return reservaRepository.findByIdInstructor(idInstructor);
    }
}
