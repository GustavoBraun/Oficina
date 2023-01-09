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

import com.samuel.oficina.domain.Veiculo;
import com.samuel.oficina.mapper.VeiculoMapper;
import com.samuel.oficina.request.VeiculoRequest;
import com.samuel.oficina.response.VeiculoResponse;
import com.samuel.oficina.service.VeiculoService;

@RestController
@RequestMapping("veiculos")
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping
	public List<Veiculo> listarVeiculos() {
		return veiculoService.listarVeiculos();
	}
	
	@GetMapping("/{id}")
	public VeiculoResponse buscarVeiculoID(@PathVariable Short id) {
		return VeiculoMapper.toVeiculoResponse(veiculoService.buscarVeiculo(id));
	}
	
	@PostMapping
	public VeiculoResponse inserirVeiculo(@RequestBody VeiculoRequest request) {
		
		Veiculo veiculo = VeiculoMapper.toVeiculo(request);
		
		VeiculoResponse response = VeiculoMapper.toVeiculoResponse(veiculoService.inserir(veiculo));
		
		return response;
	}
	
	@DeleteMapping("/{id}")
	public VeiculoResponse excluirVeiculo(@PathVariable Short id) {
		return VeiculoMapper.toVeiculoResponse(veiculoService.excluirVeiculo(id));	
		}
	
	@PutMapping
	public VeiculoResponse editarVeiculo(@RequestBody VeiculoRequest request) {
		
		Veiculo veiculo = VeiculoMapper.toVeiculo(request);
		
		VeiculoResponse response = VeiculoMapper.toVeiculoResponse(veiculoService.inserir(veiculo));
		
		return response;
	}
}
