package com.samuel.oficina.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idCliente;
	
	@Column(length = 11, unique = true)
	private String CPF;
	
	@Column(length = 11)
	private String telefone;
	
	@Column(length = 50, unique = true)
	private String email;
	
	@Column(length = 50)
	private String nome;
}
