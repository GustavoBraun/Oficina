package com.samuel.oficina.response;

import com.samuel.oficina.domain.Cargo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponse {

	private Short idUsuario;
	
	private String nome;
	
	private String email;
	
	private String senha;
	
	private Cargo idcargo;
	
	
}
