package com.gustavoar.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.gustavoar.eventosapp.models.Convidado;
import com.gustavoar.eventosapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
	Iterable<Convidado> findByEvento(Evento evento);

	Convidado findByRg(String rg);
}