package com.samuel.oficina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.oficina.domain.Telas;
import com.samuel.oficina.repository.TelasRepository;

@Service
public class TelasService {
	@Autowired
	private TelasRepository telasRepository;

	public List<Telas> listarTodosAsTelas() {
		List<Telas> ordenServicos = telasRepository.findAll();
		if (ordenServicos.isEmpty()) {
			throw new RuntimeException("Não existem telas cadastrados.");
		}
		return ordenServicos;
	}
	
	public Telas inserirTelas(Telas ordem) {
		return telasRepository.save(ordem);
	}
	
	public Telas excluirTelas(short id) {
		Optional<Telas> ordemEncontrada = telasRepository.findById(id);
		telasRepository.delete(ordemEncontrada.get());
		return ordemEncontrada.get();
	}
}
