package com.example.SistemaAprendisaje.repositories;

import com.example.SistemaAprendisaje.models.Instructor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends MongoRepository<Instructor, String> {
}
