package com.samuel.oficina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.oficina.domain.Cargo;
import com.samuel.oficina.repository.CargoRepository;

@Service
public class CargoService {

	@Autowired
	private CargoRepository cargoRepository;
	
	public List<Cargo> listarTodosOsCargos() {
		List<Cargo> cargos = cargoRepository.findAll();
		if (cargos.isEmpty()) {
			throw new RuntimeException("Não existem cargos cadastrados.");
		}
		return cargos;
	}
	
	public Cargo inserirCargo(Cargo cargo) {
		return cargoRepository.save(cargo);
	}
	
	public Cargo excluirCargo(short id) {
		Optional<Cargo> cargoEncontrado = cargoRepository.findById(id);
		cargoRepository.delete(cargoEncontrado.get());
		return cargoEncontrado.get();
	}
	
	public void editarCargo(Cargo cargo) {
		cargoRepository.save(cargo);
	}
	
}
