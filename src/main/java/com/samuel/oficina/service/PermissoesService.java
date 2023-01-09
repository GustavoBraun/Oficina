package com.samuel.oficina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.oficina.domain.Permissoes;
import com.samuel.oficina.repository.PermissoesRepository;

@Service
public class PermissoesService {
	@Autowired
	private PermissoesRepository permissoesRepository;


	public List<Permissoes> listarTodasPermissoes() {
		List<Permissoes> permissoes = permissoesRepository.findAll();
		if (permissoes.isEmpty()) {
			throw new RuntimeException("Não existem permissões cadastrados.");
		}
		return permissoes;
	}
	
	public Permissoes inserirPermissoes(Permissoes Permissoes) {
		return permissoesRepository.save(Permissoes);
	}
	
	public Permissoes excluirPermissoes(short id) {
		Optional<Permissoes> PermissoesEncontrado = permissoesRepository.findById(id);
		permissoesRepository.delete(PermissoesEncontrado.get());
		return PermissoesEncontrado.get();
	}
}
