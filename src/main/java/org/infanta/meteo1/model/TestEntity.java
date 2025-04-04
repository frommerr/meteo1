package org.infanta.meteo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class TestEntity {

    // Getters y Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;

    // Constructor vacío (necesario para JPA)
    public TestEntity() {
    }

    // Constructor con parámetros
    public TestEntity(String nombre) {
        this.nombre = nombre;
    }

}
