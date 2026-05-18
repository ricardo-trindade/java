package com.login.exemplo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.exemplo.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	Usuario findByEmail(String email);
}
