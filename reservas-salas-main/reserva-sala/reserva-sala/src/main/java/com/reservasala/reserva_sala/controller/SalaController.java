package com.reservasala.reserva_sala.controller;

import com.reservasala.reserva_sala.model.Sala;
import com.reservasala.sala.service.SalaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/salas")
public class SalaController {
    @Autowired
    private SalaService service;

    @GetMapping
    public ResponseEntity<List<Sala>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping("/salvar")
    public ResponseEntity<Sala> salvar(@RequestBody Sala sala) {
        Sala novaSala = service.salvar(sala);
        return ResponseEntity.ok(novaSala);
    }
}
