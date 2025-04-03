package com.reservasala.reserva_sala.controller;

import com.reservasala.reserva.service.ReservaService;
import com.reservasala.reserva_sala.dto.ReservaDTO;
import com.reservasala.reserva_sala.model.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
@RestController
@RequestMapping("/api/reservas")
public class ReservasController {
    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public ResponseEntity<List<Reserva>> listar() {
        return ResponseEntity.ok(reservaService.listar());
    }

    @PostMapping("/salvar")
    public ResponseEntity<Reserva> salvar(@RequestBody ReservaDTO reservaDTO) {
        Reserva reserva = new Reserva();
        reserva.setDataHora(LocalDateTime.parse(reservaDTO.getDataHora()));
        reserva.setSalaId(reservaDTO.getSalaId());
        reserva.setUsuarioId(reservaDTO.getUsuarioId());

        Reserva novaReserva = reservaService.salvar(reserva);
        return ResponseEntity.ok(novaReserva);
    }
}