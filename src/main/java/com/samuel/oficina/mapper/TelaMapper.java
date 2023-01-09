package com.samuel.oficina.mapper;

import com.samuel.oficina.domain.Telas;
import com.samuel.oficina.request.TelasRequest;
import com.samuel.oficina.response.TelasResponse;

public class TelaMapper {
	public static Telas toTelas (TelasRequest request) {
		Telas telas = new Telas();
		telas.setDescricaoTela(request.getDescricaoTela());
		return telas;
	}
	public static TelasResponse totelasResponse(Telas tela) {
		TelasResponse response = new TelasResponse();
		response.setDescricaoTela(tela.getDescricaoTela());
		response.setIdtela(tela.getIdtela());
		return response;
	}
}
