package com.fixnow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fixnow.model.Incidencia;
import com.fixnow.service.IncidenciaService;

@Service
@RestController
@RequestMapping("/api/v1/incidencias")
public class IncidenciaController {
    @Autowired
    private IncidenciaService service;
    // GET 
    @GetMapping
    public ResponseEntity<List<Incidencia>> getAllIncidencias() {
        return ResponseEntity.ok(service.getAllIncidencias());
    }

    // POST 
    @PostMapping
    public ResponseEntity<Incidencia> guardar(@RequestBody Incidencia incidencia) {
        Incidencia nueva = service.saveIncidencia(incidencia);
        return ResponseEntity.status(HttpStatus.CREATED).body(nueva);
    }

    // GET /api/v1/incidencias/1
    @GetMapping("/{id}")
    public ResponseEntity<Incidencia> obtener(@PathVariable int id) {
        return ResponseEntity.ok(service.getIncidencia(id));
    }

    // PUT /api/v1/incidencias/1
    @PutMapping("/{id}")
    public ResponseEntity<Incidencia> actualizar(@PathVariable int id, @RequestBody Incidencia incidencia) {
        return ResponseEntity.ok(service.updateIncidencia(incidencia));
    }

    // DELETE /api/v1/incidencias/1
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {
        service.deleteIncidencia(id);
        return ResponseEntity.noContent().build();
    }
}

