package com.samuel.oficina.response;

import com.samuel.oficina.domain.Veiculo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrdemResponse {

	private Short idOrdem;

	private Veiculo idVeiculo;
}
