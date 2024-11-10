package com.Proyecto.SistemaBienestar.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Proyecto.SistemaBienestar.models.Instructor;


@Repository
public interface InstructorRepository extends MongoRepository<Instructor, String> {
}
