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
import com.samuel.oficina.domain.Telas;
import com.samuel.oficina.repository.TelasRepository;

@SpringBootTest
@WebAppConfiguration
@ExtendWith(SpringExtension.class)
public class TelasServiceTests {
	@Autowired
	private TelasService telasService;
	@Autowired 
	private TelasRepository telasRepository;
	
	@Test
	public void excluiTelasTest() {
		telasService.excluirTelas(Short.valueOf("8"));
		Optional<Telas> telasOptional = telasRepository.findById(Short.valueOf("8"));
		assertTrue(telasOptional.isEmpty());
	}
	
	@Test
	public void listarTelasTest() {
		List<Telas> telas = telasService.listarTodosAsTelas();
		assertFalse(telas.isEmpty());
	}
}
