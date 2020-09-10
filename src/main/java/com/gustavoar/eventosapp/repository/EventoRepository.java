package com.gustavoar.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.gustavoar.eventosapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	Evento findByCodigo(long codigo);
}