package com.samuel.oficina.domain;

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
public class Servico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idServico;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private OrdemServico idOrdemServico;
	
	@Column(length = 20, nullable = false)
	private String nomeServico;
	
	@Column(length = 50)
	private String descricaoServico;
}
