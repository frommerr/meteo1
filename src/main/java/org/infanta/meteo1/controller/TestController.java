package org.infanta.meteo1.controller;

import org.infanta.meteo1.model.TestEntity;
import org.infanta.meteo1.repository.TestEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private TestEntityRepository testEntityRepository;

    // Endpoint para crear una nueva entidad de prueba
    @PostMapping("/create")
    public TestEntity createTestEntity(@RequestParam String nombre) {
        TestEntity entity = new TestEntity(nombre);
        return testEntityRepository.save(entity);
    }

    // Endpoint para listar todas las entidades
    @GetMapping("/list")
    public List<TestEntity> listTestEntities() {
        return testEntityRepository.findAll();
    }
}
