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

import com.samuel.oficina.domain.Permissoes;
import com.samuel.oficina.mapper.PermissaoMapper;
import com.samuel.oficina.request.PermissaoRequest;
import com.samuel.oficina.response.PermissaoResponse;
import com.samuel.oficina.service.PermissoesService;

@RestController
@RequestMapping("permissoes")
public class PermissaoController {
	@Autowired
	private PermissoesService permissoesService;
	
	@GetMapping
	public List<Permissoes> listarPermissoess() {
		return permissoesService.listarTodasPermissoes();
	}
	
	@PostMapping
	public PermissaoResponse inserirPermissoes(@RequestBody PermissaoRequest request) {
		
		Permissoes permissoes = PermissaoMapper.toPermissoes(request);
		
		PermissaoResponse response = PermissaoMapper.toPermissaoResponse(permissoesService.inserirPermissoes(permissoes));
		
		return response;
	}
	
	@DeleteMapping("/{id}")
	public PermissaoResponse excluirPermissoes(@PathVariable Short id) {
		return PermissaoMapper.toPermissaoResponse(permissoesService.excluirPermissoes(id));
	}
	
	@PutMapping
	public PermissaoResponse editarPermissoes(@RequestBody PermissaoRequest request) {
		
		Permissoes permissoes = PermissaoMapper.toPermissoes(request);
		
		PermissaoResponse response = PermissaoMapper.toPermissaoResponse(permissoesService.inserirPermissoes(permissoes));
		
		return response;
	}
}
