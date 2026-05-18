package com.login.exemplo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {
	
	@NotBlank(message = "Name may not be null")
	private String name;
	
	@NotBlank(message = "You're shitting")
	private String email;
	
	@Size(min = 6, max = 20, message = "Password must be between 6 and 20 characters long")
	private String password;

	public UsuarioRequestDTO() {
		super();
	}

	public UsuarioRequestDTO(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}


