package com.gustavoar.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.gustavoar.eventosapp.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

	Usuario findByLogin(String login);
}