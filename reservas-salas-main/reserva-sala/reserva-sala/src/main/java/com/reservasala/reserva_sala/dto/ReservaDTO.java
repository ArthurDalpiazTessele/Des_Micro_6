package com.reservasala.reserva_sala.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservaDTO {
    private Long salaId;
    private Long usuarioId;
    private String dataHora; // Formato ISO 8601 (ex: "2025-04-02T14:30:00")
}
