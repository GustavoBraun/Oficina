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

import com.samuel.oficina.domain.Mecanico;
import com.samuel.oficina.mapper.MecanicoMapper;
import com.samuel.oficina.request.MecanicoRequest;
import com.samuel.oficina.response.MecanicoResponse;
import com.samuel.oficina.service.MecanicoService;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("mecanicos")
public class MecanicoController {
	@Autowired
	private MecanicoService mecanicoService;
	
	@GetMapping
	public List<Mecanico> listarMecanicos() {
		return mecanicoService.listarTodosOsMecanicos();
	}
	
	
	@PostMapping
	public MecanicoResponse inserirMecanico(@RequestBody MecanicoRequest request) {
		
		Mecanico mecanico = MecanicoMapper.toMecanico(request);
		
		MecanicoResponse response = MecanicoMapper.toMecanicoResponse(mecanicoService.inserirMecanico(mecanico));
		
		return response;
	}
	
	@DeleteMapping("/{id}")
	public MecanicoResponse excluirMecanico(@PathVariable Short id) {
		return MecanicoMapper.toMecanicoResponse(mecanicoService.excluirMecanico(id));
	}
	
	@PutMapping
	public MecanicoResponse editarMecanico(@RequestBody MecanicoRequest request) {
		
		Mecanico mecanico = MecanicoMapper.toMecanico(request);
		
		MecanicoResponse response = MecanicoMapper.toMecanicoResponse(mecanicoService.inserirMecanico(mecanico));
		
		return response;
	}
}
