package com.samuel.oficina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.oficina.domain.Mecanico;
import com.samuel.oficina.repository.MecanicoRepository;

@Service
public class MecanicoService {
	@Autowired
	private MecanicoRepository mecanicoRepository;

	public List<Mecanico> listarTodosOsMecanicos() {
		List<Mecanico> mecanicos = mecanicoRepository.findAll();
		if (mecanicos.isEmpty()) {
			throw new RuntimeException("Não existem mecanicos cadastrados.");
		}
		return mecanicos;
	}
	
	public Mecanico inserirMecanico(Mecanico mecanico) {
		return mecanicoRepository.save(mecanico);
	}
	
	public Mecanico excluirMecanico(short id) {
		Optional<Mecanico> mecanicoEncontrado = mecanicoRepository.findById(id);
		mecanicoRepository.delete(mecanicoEncontrado.get());
		return mecanicoEncontrado.get();
	}
	
}
