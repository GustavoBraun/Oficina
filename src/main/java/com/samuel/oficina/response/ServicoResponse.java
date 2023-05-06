package com.samuel.oficina.response;

import com.samuel.oficina.domain.OrdemServico;

import lombok.Data;

@Data
public class ServicoResponse {
	private Short idServico;
	
	private OrdemServico idOrdemServico;
	
	private String nomeServico;
	
	private String descricaoServico;
}
