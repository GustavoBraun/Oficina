package com.samuel.oficina.request;

import com.samuel.oficina.domain.Cargo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequest {
	
	private Short idUsuario;

	private String nome;
	
	private String email;
	
	private String senha;
	
	private Cargo idcargo;
	
}
