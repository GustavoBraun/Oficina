package com.samuel.oficina.response;

import com.samuel.oficina.domain.OrdemServico;
import com.samuel.oficina.domain.Usuario;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MecanicoResponse {

	
	private Usuario idUsuario;

	private OrdemServico IdOrdem;

}
