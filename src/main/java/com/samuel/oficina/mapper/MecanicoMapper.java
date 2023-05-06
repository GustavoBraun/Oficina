package com.samuel.oficina.mapper;

import com.samuel.oficina.domain.Mecanico;
import com.samuel.oficina.request.MecanicoRequest;
import com.samuel.oficina.response.MecanicoResponse;

public class MecanicoMapper {
	public static Mecanico toMecanico (MecanicoRequest request) {
		
		Mecanico mecanico = new Mecanico();
		mecanico.setIdMecanico(request.getIdMecanico());
		mecanico.setIdUsuario(request.getIdUsuario());
		mecanico.setIdOrdem(request.getIdOrdem());
		
		return mecanico;
	}
	
	public static MecanicoResponse toMecanicoResponse (Mecanico mecanico) {
		MecanicoResponse response = new MecanicoResponse();
		response.setIdOrdem(mecanico.getIdOrdem());
		response.setIdUsuario(mecanico.getIdUsuario());
		return response;
	}
}
