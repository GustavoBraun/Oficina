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

import com.samuel.oficina.domain.Mecanico;
import com.samuel.oficina.repository.MecanicoRepository;

@SpringBootTest
@WebAppConfiguration
@ExtendWith(SpringExtension.class)
public class MecanicoServiceTest {
	@Autowired
	private MecanicoService mecanicoService;
	@Autowired 
	private MecanicoRepository mecanicoRepository;
	
	@Test
	public void excluiMecanicoTest() {
		mecanicoService.excluirMecanico(Short.valueOf("8"));
		Optional<Mecanico> mecanicoOptional = mecanicoRepository.findById(Short.valueOf("8"));
		assertTrue(mecanicoOptional.isEmpty());
	}
	
	@Test
	public void listarMecanicosTest() {
		List<Mecanico> mecanicos = mecanicoService.listarTodosOsMecanicos();
		assertFalse(mecanicos.isEmpty());
	}
}
