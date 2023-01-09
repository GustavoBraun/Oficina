package com.samuel.oficina.request;

import com.samuel.oficina.domain.Cargo;
import com.samuel.oficina.domain.Telas;

import lombok.Data;


@Data
public class PermissaoRequest {

	private Telas idtela;
	

	private Cargo idcargo;
}
