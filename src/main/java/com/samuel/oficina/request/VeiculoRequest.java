package com.samuel.oficina.request;

import java.time.LocalDate;

import com.samuel.oficina.domain.Cliente;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VeiculoRequest {
	private Short idVeiculo;
	
	private String placa;
	private String cor;
	
	private String tipoVeiculo;
	
	private LocalDate ano;
	private Cliente idCliente;

}
