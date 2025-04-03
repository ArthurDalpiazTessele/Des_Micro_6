package com.reservasala.reserva_sala.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDateTime dataHora;

    private Long salaId;  // Referência ao ID da sala (evitando forte acoplamento)

    private Long usuarioId;  // Referência ao ID do usuário (evitando forte acoplamento)

}