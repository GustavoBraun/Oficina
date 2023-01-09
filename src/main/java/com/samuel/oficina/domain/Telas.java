package com.samuel.oficina.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Telas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idtela;
	
	@Column(length = 50)
	private String descricaoTela;
}
