package com.Proyecto.SistemaBienestar.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Proyecto.SistemaBienestar.models.Instalacion;
import com.Proyecto.SistemaBienestar.services.InstalacionService;

import java.util.List;

@RestController
@RequestMapping("/api/instalaciones") //esto es la url de la api para postman , 
public class InstalacionController {   //por ejemplo: http://localhost:8080/api/instalaciones
                                       //se utilizan para todos los metodos http
    @Autowired
    private InstalacionService instalacionService;

    @PostMapping // crea una nueva instalacion ej: /api/instalaciones
    public ResponseEntity<Instalacion> crearInstalacion(@RequestBody Instalacion instalacion) {
        Instalacion nuevaInstalacion = instalacionService.crearInstalacion(instalacion);
        return ResponseEntity.ok(nuevaInstalacion);
    }

    @GetMapping //obtiene todas las instalaciones ej: /api/instalaciones
    public ResponseEntity<List<Instalacion>> obtenerInstalaciones() {
        List<Instalacion> instalaciones = instalacionService.obtenerInstalaciones();
        return ResponseEntity.ok(instalaciones);
    }

    @GetMapping("/{id}") //obtiene una instalacion por id ej: /api/instalaciones/1
    public ResponseEntity<Instalacion> obtenerInstalacionPorId(@PathVariable String id) {
        return instalacionService.obtenerInstalacionPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}") //elimina una instalacion por id ej: /api/instalaciones/1
    public ResponseEntity<Void> eliminarInstalacion(@PathVariable String id) {
        instalacionService.eliminarInstalacion(id);
        return ResponseEntity.noContent().build();
    }
}
