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

import com.samuel.oficina.domain.Cargo;
import com.samuel.oficina.mapper.CargoMapper;
import com.samuel.oficina.repository.CargoRepository;
import com.samuel.oficina.request.CargoRequest;
import com.samuel.oficina.response.CargoResponse;
import com.samuel.oficina.service.CargoService;

@RestController
@RequestMapping("cargos")
@CrossOrigin(origins = "*")
public class CargoController {

	@Autowired
	private CargoService cargoService;

	@Autowired
	private CargoRepository cargoRepository;
	
	@GetMapping
	public List<Cargo> listarCargos(){
		return cargoService.listarTodosOsCargos();
	}
	
	@PostMapping
	public CargoResponse inserirCargo(@RequestBody CargoRequest request) {

		Cargo cargo = CargoMapper.toCargo(request);
		
		CargoResponse response = CargoMapper.toCargoResponse(cargoService.inserirCargo(cargo));
		
		return response;
	}
	
	
	@DeleteMapping("/{id}")
	public CargoResponse excluirCargo (@PathVariable Short id) {
		return CargoMapper.toCargoResponse(cargoService.excluirCargo(id));
	}
	
	@PutMapping
	public CargoResponse editarCargo(@RequestBody CargoRequest request) {

		Cargo cargo = CargoMapper.toCargo(request);
		
		CargoResponse response = CargoMapper.toCargoResponse(cargoRepository.save(cargo));
		
		return response;
	}
}
