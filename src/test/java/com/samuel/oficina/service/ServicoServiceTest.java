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
import com.samuel.oficina.domain.Servico;
import com.samuel.oficina.repository.ServicoRepository;

@SpringBootTest
@WebAppConfiguration
@ExtendWith(SpringExtension.class)
public class ServicoServiceTest {
	@Autowired
	private ServicoService servicoService;
	@Autowired 
	private ServicoRepository servicoRepository;
	
	@Test
	public void excluiServicoTest() {
		servicoService.excluirServico(Short.valueOf("8"));
		Optional<Servico> servicoOptional = servicoRepository.findById(Short.valueOf("8"));
		assertTrue(servicoOptional.isEmpty());
	}
	
	@Test
	public void listarServicosTest() {
		List<Servico> servicos = servicoService.listarTodasServico();
		assertFalse(servicos.isEmpty());
	}
}
