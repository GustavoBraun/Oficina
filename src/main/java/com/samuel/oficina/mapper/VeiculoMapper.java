package com.samuel.oficina.mapper;

import com.samuel.oficina.domain.Veiculo;
import com.samuel.oficina.request.VeiculoRequest;
import com.samuel.oficina.response.VeiculoResponse;

public class VeiculoMapper {
	public static Veiculo toVeiculo(VeiculoRequest request) {
		
		Veiculo veiculo = new Veiculo();
		veiculo.setAno(request.getAno());
		veiculo.setCor(request.getCor());
		veiculo.setIdCliente(request.getIdCliente());
		veiculo.setIdVeiculo(request.getIdVeiculo());
		veiculo.setPlaca(request.getPlaca());
		veiculo.setTipoVeiculo(request.getTipoVeiculo());
		return veiculo;
	}
	
	public static VeiculoResponse toVeiculoResponse(Veiculo veiculo) {
		
		VeiculoResponse response = new VeiculoResponse();
		response.setAno(veiculo.getAno());
		response.setCor(veiculo.getCor());
		response.setPlaca(veiculo.getPlaca());
		response.setTipoVeiculo(veiculo.getTipoVeiculo());
		return response;
	}
}
