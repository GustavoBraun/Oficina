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

import com.samuel.oficina.domain.Telas;
import com.samuel.oficina.mapper.TelaMapper;
import com.samuel.oficina.request.TelasRequest;
import com.samuel.oficina.response.TelasResponse;
import com.samuel.oficina.service.TelasService;

@RestController
@RequestMapping("telas")
public class TelaController {
	@Autowired
	private TelasService telasService;
	
	@GetMapping
	public List<Telas> listarTelass() {
		return telasService.listarTodosAsTelas();
	}
	
	
	@PostMapping
	public TelasResponse inserirTelas(@RequestBody TelasRequest request) {
		
		Telas telas = TelaMapper.toTelas(request);
		
		TelasResponse response = TelaMapper.totelasResponse(telasService.inserirTelas(telas));
		
		return response;
	}
	
	@DeleteMapping("/{id}")
	public Telas excluirTelas(@PathVariable Short id) {
		return telasService.excluirTelas(id);
	}
	
	@PutMapping
	public TelasResponse editarTelas(@RequestBody TelasRequest request) {
		
		Telas telas = TelaMapper.toTelas(request);
		
		TelasResponse response = TelaMapper.totelasResponse(telasService.inserirTelas(telas));
		
		return response;
	}
}
