package org.infanta.meteo1.repository;

import org.infanta.meteo1.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {
    // Puedes agregar métodos de consulta personalizados si es necesario.
    List<TestEntity> findByNombre(String nombre);
}
