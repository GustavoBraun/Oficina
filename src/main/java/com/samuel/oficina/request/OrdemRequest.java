package com.samuel.oficina.request;

import com.samuel.oficina.domain.Veiculo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrdemRequest {

	private Short idOrdem;

	private Veiculo idVeiculo;
}
