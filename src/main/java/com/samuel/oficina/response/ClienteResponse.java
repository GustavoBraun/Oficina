package com.samuel.oficina.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteResponse {
	
	private String CPF;
	
	private String telefone;
	
	private String email;
	
	private String nome;

}
