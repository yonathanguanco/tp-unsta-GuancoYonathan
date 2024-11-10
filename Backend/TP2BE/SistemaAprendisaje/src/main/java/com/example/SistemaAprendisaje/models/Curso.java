package com.example.SistemaAprendisaje.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "cursos") //nombre de la coleccion en la base de datos de mongodb
public class Curso {             //se crea cuando se crea un curso, se crea automaticamente

    @Id
    private String idCurso;
    private String nombre;
    private String descripcion;
    private Instructor instructor; 
    private List<Modulo> modulos; 
    private List<Estudiante> estudiantes;  

    // Constructor
    public Curso(String idCurso, String nombre, String descripcion, Instructor instructor, List<Modulo> modulos, List<Estudiante> estudiantes) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.instructor = instructor;
        this.modulos = modulos;
        this.estudiantes = estudiantes;  
    }

    // Getters y setters
    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
