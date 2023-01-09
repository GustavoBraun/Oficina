package com.samuel.oficina.response;

import com.samuel.oficina.domain.Cargo;
import com.samuel.oficina.domain.Telas;

import lombok.Data;
@Data
public class PermissaoResponse {
	private Short idPermissao;
	
	private Telas idtela;
	
	private Cargo idcargo;
}
