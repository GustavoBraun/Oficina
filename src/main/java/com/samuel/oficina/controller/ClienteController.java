package com.samuel.oficina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.oficina.domain.Cliente;
import com.samuel.oficina.mapper.ClienteMapper;
import com.samuel.oficina.request.ClienteRequest;
import com.samuel.oficina.response.ClienteResponse;
import com.samuel.oficina.service.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> listarClientes() {
		return clienteService.listarClientes();
	}
	
	@GetMapping("/{id}")
	public ClienteResponse buscarClientePorID(@PathVariable Short id) {
		return ClienteMapper.toClienteResponse(clienteService.buscarCliente(id));
	}
	
	@PostMapping
	public ClienteResponse inserirCliente(@RequestBody ClienteRequest request) {
		
		Cliente cliente = ClienteMapper.toCliente(request);
		
		ClienteResponse response = ClienteMapper.toClienteResponse(clienteService.inserir(cliente));
		
		return response;
	}
	
	@DeleteMapping("/{id}")
	public ClienteResponse excluirCliente(@PathVariable Short id) {
		return ClienteMapper.toClienteResponse(clienteService.excluiCliente(id));
	}
	
	@PutMapping
	public ClienteResponse editarCliente(@RequestBody ClienteRequest request) {
		
		Cliente cliente = ClienteMapper.toCliente(request);
		
		ClienteResponse response = ClienteMapper.toClienteResponse(clienteService.inserir(cliente));
		
		return response;
	}
}
