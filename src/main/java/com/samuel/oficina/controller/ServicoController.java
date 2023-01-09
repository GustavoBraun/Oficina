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

import com.samuel.oficina.domain.Servico;
import com.samuel.oficina.mapper.ServicoMapper;
import com.samuel.oficina.request.ServicoRequest;
import com.samuel.oficina.response.ServicoResponse;
import com.samuel.oficina.service.ServicoService;

@RestController
@RequestMapping("servicos")
public class ServicoController {
	@Autowired
	private ServicoService servicoService;
	
	@GetMapping
	public List<Servico> listarServicos() {
		return servicoService.listarTodasServico();
	}
	
	
	@PostMapping
	public ServicoResponse inserirServico(@RequestBody ServicoRequest request) {
		
		Servico servico = ServicoMapper.toServico(request);
		
		ServicoResponse response = ServicoMapper.toServicoResponse(servicoService.inserirServico(servico));
		
		return response;
	}
	
	@DeleteMapping("/{id}")
	public Servico excluirServico(@PathVariable Short id) {
		return servicoService.excluirServico(id);
	}
	
	@PutMapping
	public ServicoResponse editarServico(@RequestBody ServicoRequest request) {
		
		Servico servico = ServicoMapper.toServico(request);
		
		ServicoResponse response = ServicoMapper.toServicoResponse(servicoService.inserirServico(servico));
		
		return response;
	}
}
