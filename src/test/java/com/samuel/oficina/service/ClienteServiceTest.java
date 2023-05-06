package com.samuel.oficina.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import com.samuel.oficina.domain.Cliente;
import com.samuel.oficina.repository.ClienteRepository;
import java.util.List;


@SpringBootTest
@WebAppConfiguration
@ExtendWith(SpringExtension.class)
public class ClienteServiceTest {
	

	@Autowired
	private ClienteService clienteService;
	@Autowired 
	private ClienteRepository clienteRepository;

	@Test
	public void buscarClienteTest() {
	     Cliente  clienteEncontrado = clienteService.buscarCliente(Short.valueOf("8"));
	     assertEquals("15100815698", clienteEncontrado.getCPF());
	     
	}
	
	@Test
	public void excluiClienteTest() {
		clienteService.excluiCliente(Short.valueOf("8"));
		Optional<Cliente> clienteOptional = clienteRepository.findById(Short.valueOf("8"));
		assertTrue(clienteOptional.isEmpty());
	}
	
	@Test
	public void listarClientesTest() {
		List<Cliente> clientes = clienteService.listarClientes();
		assertFalse(clientes.isEmpty());
	}
}
