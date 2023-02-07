package com.samuel.oficina.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CargoRequest {
	private Short id;
	
	private String nome;
}
