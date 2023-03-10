package com.samuel.oficina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.oficina.Exception.BusinessException;
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
		if (cargo.getNome().equals("")) {
			throw new BusinessException("O nome é obrigatório!");
		}
		return cargoRepository.save(cargo);
	}
	
	public Cargo excluirCargo(short id) {
		Optional<Cargo> cargoEncontrado = cargoRepository.findById(id);
		if (cargoEncontrado.isEmpty()) {
			throw new RuntimeException("Cargo não encontrado.");
		}
		cargoRepository.delete(cargoEncontrado.get());
		return cargoEncontrado.get();
	}
	
	public void editarCargo(Cargo cargo) {
		cargoRepository.save(cargo);
	}
	
}
