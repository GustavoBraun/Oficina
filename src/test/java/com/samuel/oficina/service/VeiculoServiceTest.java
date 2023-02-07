package com.samuel.oficina.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import com.samuel.oficina.domain.Veiculo;
import com.samuel.oficina.repository.VeiculoRepository;

@SpringBootTest
@WebAppConfiguration
@ExtendWith(SpringExtension.class)
public class VeiculoServiceTest {
	@Autowired
	private VeiculoService veiculoService;
	@Autowired 
	private VeiculoRepository veiculoRepository;
	
	
	@Test
	public void buscarVeiculoTest() {
	     Veiculo veiculo = veiculoService.buscarVeiculo(Short.valueOf("3"));
	     assertEquals("HPZ2061", veiculo.getPlaca());
	     
	}
	
	@Test
	public void excluiVeiculoTest() {
		veiculoService.excluirVeiculo(Short.valueOf("8"));
		Optional<Veiculo> veiculoOptional = veiculoRepository.findById(Short.valueOf("8"));
		assertTrue(veiculoOptional.isEmpty());
	}
	
	@Test
	public void listarVeiculosTest() {
		List<Veiculo> veiculos = veiculoService.listarVeiculos();
		assertFalse(veiculos.isEmpty());
	}
}
