package com.samuel.oficina.mapper;

import com.samuel.oficina.domain.Cliente;
import com.samuel.oficina.request.ClienteRequest;
import com.samuel.oficina.response.ClienteResponse;

public class ClienteMapper {
	public static Cliente toCliente(ClienteRequest request) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(request.getIdCliente());
		cliente.setCPF(request.getCPF());
		cliente.setEmail(request.getEmail());
		cliente.setNome(request.getNome());
		cliente.setTelefone(request.getTelefone());
		return cliente;
	}
	
	public static ClienteResponse toClienteResponse(Cliente cliente) {
		ClienteResponse response = new ClienteResponse();
		response.setCPF(cliente.getCPF());
		response.setEmail(cliente.getEmail());
		response.setNome(cliente.getNome());
		response.setTelefone(cliente.getTelefone());;
		return response;
	}
}
