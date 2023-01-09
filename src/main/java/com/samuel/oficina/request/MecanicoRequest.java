package com.samuel.oficina.request;

import com.samuel.oficina.domain.OrdemServico;
import com.samuel.oficina.domain.Usuario;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MecanicoRequest {

	
	private Usuario idUsuario;

	private OrdemServico IdOrdem;
}
