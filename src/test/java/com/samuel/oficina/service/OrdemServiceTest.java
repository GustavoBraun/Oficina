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
	
import com.samuel.oficina.domain.OrdemServico;
import com.samuel.oficina.repository.OrdemServicoRepository;

@SpringBootTest
@WebAppConfiguration
@ExtendWith(SpringExtension.class)
public class OrdemServiceTest {
	@Autowired
	private OrdemService ordemService;
	@Autowired 
	private OrdemServicoRepository ordemServicoRepository;
	
	@Test
	public void excluiOrdemTest() {
		ordemService.excluirOrdem(Short.valueOf("8"));
		Optional<OrdemServico> ordemOptional = ordemServicoRepository.findById(Short.valueOf("8"));
		assertTrue(ordemOptional.isEmpty());
	}
	
	@Test
	public void listarOrdensTest() {
		List<OrdemServico> ordens= ordemService.listarTodosAsOrdens();
		assertFalse(ordens.isEmpty());
	}
}
