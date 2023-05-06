package com.samuel.oficina.mapper;

import com.samuel.oficina.domain.Servico;
import com.samuel.oficina.request.ServicoRequest;
import com.samuel.oficina.response.ServicoResponse;

public class ServicoMapper {
	public static Servico toServico(ServicoRequest request) {
		Servico servico = new Servico();
		servico.setDescricaoServico(request.getDescricaoServico());
		servico.setNomeServico(request.getNomeServico());
		servico.setIdOrdemServico(request.getIdOrdemServico());
		servico.setIdServico(request.getIdServico());
		return servico;
	}
	
	public static ServicoResponse toServicoResponse(Servico servico) {
		
		ServicoResponse response = new ServicoResponse();
		
		response.setDescricaoServico(servico.getDescricaoServico());
		response.setIdOrdemServico(servico.getIdOrdemServico());
		response.setIdServico(servico.getIdServico());
		response.setNomeServico(servico.getNomeServico());
		return response;
	}
}
