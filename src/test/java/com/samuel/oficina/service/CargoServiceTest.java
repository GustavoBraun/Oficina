package com.samuel.oficina.service;

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

import com.samuel.oficina.domain.Cargo;
import com.samuel.oficina.repository.CargoRepository;

@SpringBootTest
@WebAppConfiguration
@ExtendWith(SpringExtension.class)
public class CargoServiceTest {
	@Autowired
	private CargoService cargoService;
	@Autowired 
	private CargoRepository cargoRepository;
	
	
	@Test
	public void excluiCargosTest() {
		cargoService.excluirCargo(Short.valueOf("8"));
		Optional<Cargo> cargoOptional = cargoRepository.findById(Short.valueOf("8"));
		assertTrue(cargoOptional.isEmpty());
	}
	
	@Test
	public void listarCargosTest() {
		List<Cargo> cargos = cargoService.listarTodosOsCargos();
		assertFalse(cargos.isEmpty());
	}
}
