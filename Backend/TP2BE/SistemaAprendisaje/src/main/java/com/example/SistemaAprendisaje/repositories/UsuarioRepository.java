package com.example.SistemaAprendisaje.repositories;

import com.example.SistemaAprendisaje.models.Usuario;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
