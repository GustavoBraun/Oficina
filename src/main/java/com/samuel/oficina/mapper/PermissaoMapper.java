package com.samuel.oficina.mapper;

import com.samuel.oficina.domain.Permissoes;
import com.samuel.oficina.request.PermissaoRequest;
import com.samuel.oficina.response.PermissaoResponse;

public class PermissaoMapper {
	public static Permissoes toPermissoes(PermissaoRequest request) {
		Permissoes permissao = new Permissoes();
		permissao.setIdcargo(request.getIdcargo());
		permissao.setIdtela(request.getIdtela());
		return permissao;
	}
	
	public static PermissaoResponse toPermissaoResponse(Permissoes permissoes) {
		PermissaoResponse response = new PermissaoResponse();
		response.setIdcargo(permissoes.getIdcargo());
		response.setIdPermissao(permissoes.getIdPermissao());
		response.setIdtela(permissoes.getIdtela());
		return response;
	}
}
