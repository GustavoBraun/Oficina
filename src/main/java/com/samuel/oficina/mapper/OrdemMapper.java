package com.samuel.oficina.mapper;

import com.samuel.oficina.domain.OrdemServico;
import com.samuel.oficina.request.OrdemRequest;
import com.samuel.oficina.response.OrdemResponse;

public class OrdemMapper {
	public static OrdemServico toOrdemServico(OrdemRequest request) {
		OrdemServico ordem = new OrdemServico();
		ordem.setIdVeiculo(request.getIdVeiculo());
		return ordem;
	}
	
	public static OrdemResponse toOrdemResponse(OrdemServico ordem) {
		
		OrdemResponse response = new OrdemResponse();
		response.setIdOrdem(ordem.getIdOrdem());
		response.setIdVeiculo(ordem.getIdVeiculo());
		return response;
	}
}
