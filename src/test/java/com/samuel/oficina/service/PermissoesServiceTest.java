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
import com.samuel.oficina.domain.Permissoes;
import com.samuel.oficina.repository.PermissoesRepository;

@SpringBootTest
@WebAppConfiguration
@ExtendWith(SpringExtension.class)
public class PermissoesServiceTest {
	@Autowired
	private PermissoesService permissoesService;
	@Autowired 
	private PermissoesRepository permissoesRepository;
	
	@Test
	public void excluiPermissaoTest() {
		permissoesService.excluirPermissoes(Short.valueOf("8"));
		Optional<Permissoes> permissaoOptional = permissoesRepository.findById(Short.valueOf("8"));
		assertTrue(permissaoOptional.isEmpty());
	}
	
	@Test
	public void listarPermissoesTest() {
		List<Permissoes> permissoes = permissoesService.listarTodasPermissoes();
		assertFalse(permissoes.isEmpty());
	}
}
