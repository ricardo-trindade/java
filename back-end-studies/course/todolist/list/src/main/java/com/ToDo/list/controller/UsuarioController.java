package com.ToDo.list.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ToDo.list.entities.Usuario;
import com.ToDo.list.repositories.UsuarioRepository;

@RestController // Diz que essa classe responde pedidos da internet (API)
public class UsuarioController {

	@Autowired // O sistema já cria e conecta o que a gente precisa aqui (banco de dados)
	UsuarioRepository usuarioRepository;
	
	@GetMapping // Quando alguém pedir, esse método vai buscar e mostrar todos os usuários
	public List<Usuario> mostrarTudo() {
		List<Usuario> lista = usuarioRepository.findAll();
		return lista;
	}
	
}

// Abrir:
// localhost:8080