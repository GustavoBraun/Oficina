package com.samuel.oficina.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteRequest {

	private Short idCliente;
	
	private String CPF;
	
	private String telefone;
	
	private String email;
	
	private String nome;
}
