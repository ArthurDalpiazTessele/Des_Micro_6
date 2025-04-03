package com.reservasala.sala.service;

import com.reservasala.reserva_sala.model.Sala;
import com.reservasala.sala.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaService {

    private final SalaRepository repository;

    @Autowired
    public SalaService(SalaRepository repository) {
        this.repository = repository;
    }

    public List<Sala> listar() {
        return repository.findAll();
    }

    public Optional<Sala> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Optional<Sala> buscarPorNome(String nome) {
        return repository.findByNome(nome);
    }

    public Sala salvar(Sala sala) {
        return repository.save(sala);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
