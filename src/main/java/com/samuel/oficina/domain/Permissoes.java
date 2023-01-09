package com.samuel.oficina.domain;

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
public class Permissoes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idPermissao;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Telas idtela;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Cargo idcargo;
	
}
