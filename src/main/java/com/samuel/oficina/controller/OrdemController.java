package com.samuel.oficina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.oficina.domain.OrdemServico;
import com.samuel.oficina.mapper.OrdemMapper;
import com.samuel.oficina.request.OrdemRequest;
import com.samuel.oficina.response.OrdemResponse;
import com.samuel.oficina.service.OrdemService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("ordens")
public class OrdemController {
	@Autowired
	private OrdemService ordemService;
	
	@GetMapping
	public List<OrdemServico> listarOrdemServicos() {
		return ordemService.listarTodosAsOrdens();
	}
	
	
	@PostMapping
	public OrdemResponse inserirOrdemServico(@RequestBody OrdemRequest request) {
		
		OrdemServico ordem = OrdemMapper.toOrdemServico(request);
		
		OrdemResponse response = OrdemMapper.toOrdemResponse(ordemService.inserirOrdem(ordem));
		
		return response;
	}
	
	@DeleteMapping("/{id}")
	public OrdemResponse excluirOrdemServico(@PathVariable Short id) {
		return OrdemMapper.toOrdemResponse(ordemService.excluirOrdem(id));
	}
	
	@PutMapping
	public OrdemResponse editarOrdemServico(@RequestBody OrdemRequest request) {
		
		OrdemServico ordem = OrdemMapper.toOrdemServico(request);
		
		OrdemResponse response = OrdemMapper.toOrdemResponse(ordemService.inserirOrdem(ordem));
		
		return response;
	}
}
