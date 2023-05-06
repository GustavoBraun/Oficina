package com.samuel.oficina.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Veiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idVeiculo;
	
	@Column(length = 7, nullable = false, unique = true)
	private String placa;
	
	@Column(length = 15, nullable = false)
	private String cor;
	
	@Column(length = 15, nullable = false)
	private String tipoVeiculo;
	
	@Column
	private LocalDate ano;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Cliente idCliente;
}
