package com.login.exemplo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.login.exemplo.dto.UsuarioRequestDTO;
import com.login.exemplo.dto.UsuarioResponseDTO;
import com.login.exemplo.entity.Usuario;
import com.login.exemplo.repositories.UsuarioRepository;

public class UsuarioService {

	private final UsuarioRepository usuarioRepository;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public UsuarioResponseDTO saveUser(UsuarioRequestDTO usuarioRequestDTO) {
		Usuario usuario = new Usuario(usuarioRequestDTO.getName(),
				usuarioRequestDTO.getEmail(),
				usuarioRequestDTO.getPassword());
		usuarioRepository.save(usuario);
		UsuarioResponseDTO user = new UsuarioResponseDTO(usuario);
				return user;
	}
	
	
	
	@PostMapping
	public ResponseEntity<?> login(@RequestBody Usuario user) {
		Usuario findUser = usuarioRepository.findByEmail(user.getEmail());
		if (findUser == null) {
			return ResponseEntity.ok("Usuário não encontrado");
		} else {
			if (findUser.getPassword() == user.getPassword()) {
				return ResponseEntity.ok("Logado com sucesso");
			} else {
				return ResponseEntity.ok("Senha incorreta");
			}
			
		}
		
	}
	
	@GetMapping(value = "listar/Fiama")
	public List<UsuarioResponseDTO> listarUsuarios1() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		List<UsuarioResponseDTO> listaDeUsuarios = new ArrayList<>();
		// List<UsuarioResponseDTO> listaDeUsuarios =
		// usuarios.stream().map(UsuarioResponseDTO::new).toList();
		for (Usuario usuario : usuarios) {
			listaDeUsuarios.add(new UsuarioResponseDTO(usuario));
		}
		
		return listaDeUsuarios;
	}
	
	@GetMapping(value = "listar/Vitinho")
	public List<Usuario> listarUsuarios() {
		return usuarioRepository.findAll();
	}
	
	//return ResponseEntity.status(HttpStatus.CREATED).body(dto);
	
	@GetMapping(value = "{id}")
	public Optional<Usuario> usuarioPorId(@PathVariable int id) {
		return usuarioRepository.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletar(@PathVariable int id) {
		if (usuarioRepository.existsById(id)) {
			usuarioRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Excluído com sucesso"); //204
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Esse ID não existe"); //404
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Usuario> atualizar(@PathVariable int id, @RequestBody Usuario novoUsuario) {
		Optional<Usuario> UsuarioExistente = usuarioRepository.findById(id);
		
		if (UsuarioExistente.isPresent()) {
			Usuario Usuario = UsuarioExistente.get();
			Usuario.setName(novoUsuario.getName());
			Usuario.setPassword(novoUsuario.getPassword());
			usuarioRepository.save(Usuario);
			return ResponseEntity.ok(Usuario);
		} else {
			//return ResponseEntity.notFound().build
			return ResponseEntity.notFound().build();
		}
	}
}

