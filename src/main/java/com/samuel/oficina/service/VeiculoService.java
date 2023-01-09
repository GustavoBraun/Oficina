package com.samuel.oficina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.oficina.domain.Veiculo;
import com.samuel.oficina.repository.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	public List<Veiculo> listarVeiculos() {
		List<Veiculo> veiculos = veiculoRepository.findAll();
		if (veiculos.isEmpty()) {
			throw new RuntimeException("Não existem veículos cadastrados.");
		}
		return veiculos;
	}
	
	public Veiculo buscarVeiculo(Short id) {
		Optional<Veiculo> veiculoEncontrado = veiculoRepository.findById(id);
		if (veiculoEncontrado.isEmpty()) {
			throw new RuntimeException("Veiculo não encontrado.");
		}
		return veiculoEncontrado.get();
	}
	
	public Veiculo inserir(Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}
	
	public Veiculo editarVeiculo(Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}
	
	public Veiculo excluirVeiculo(Short id) {
		Optional<Veiculo> veiculoEncontrado = veiculoRepository.findById(id);
		veiculoRepository.delete(veiculoEncontrado.get());
		return veiculoEncontrado.get();
	}
}
