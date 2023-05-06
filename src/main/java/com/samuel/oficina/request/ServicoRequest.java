package com.samuel.oficina.request;

import com.samuel.oficina.domain.OrdemServico;

import lombok.Data;
@Data
public class ServicoRequest {
	private Short idServico;

	private OrdemServico idOrdemServico;
	
	private String nomeServico;
	
	private String descricaoServico;

}
