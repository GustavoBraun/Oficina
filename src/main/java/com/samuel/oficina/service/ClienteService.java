package com.samuel.oficina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.oficina.Exception.BusinessException;
import com.samuel.oficina.domain.Cliente;
import com.samuel.oficina.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> listarClientes() {
		List<Cliente> clientes = clienteRepository.findAll();
		if (clientes.isEmpty()) {
			throw new RuntimeException("Não existem clientes cadastrados."); 
		}
		return clientes;
	}
	
	public Cliente buscarCliente(Short id) {
		Optional<Cliente> clienteEncontrado = clienteRepository.findById(id);
		if (clienteEncontrado.isEmpty()) {
			throw new BusinessException("Cliente não encontrado.");
		}
		return clienteEncontrado.get();
		
	}
	
	public Cliente inserirCliente(Cliente cliente) {
		boolean existeCpf = false;
		
		
		Optional<Cliente> clientecpf = clienteRepository.findByCPF(cliente.getCPF());
		
		
		if (clientecpf.isPresent()) {			
			if (!clientecpf.get().getIdCliente().equals(cliente.getIdCliente())) {
				existeCpf = true;
			}
			
		}
		
		if (existeCpf) {
			throw new BusinessException("CPF já cadastrado");
		}
		
		
		return clienteRepository.save(cliente);
	}

	public Cliente excluiCliente(Short id) {
		Optional<Cliente> clienteEncontrado = clienteRepository.findById(id);
		clienteRepository.delete(clienteEncontrado.get());
		return clienteEncontrado.get();
	}
	
	public void editarCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
}
