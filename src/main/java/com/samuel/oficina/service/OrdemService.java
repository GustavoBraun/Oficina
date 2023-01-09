package com.samuel.oficina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.oficina.domain.OrdemServico;
import com.samuel.oficina.repository.OrdemServicoRepository;

@Service
public class OrdemService {
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	

	public List<OrdemServico> listarTodosAsOrdens() {
		List<OrdemServico> ordenServicos = ordemServicoRepository.findAll();
		if (ordenServicos.isEmpty()) {
			throw new RuntimeException("Não existem ordens cadastrados.");
		}
		return ordenServicos;
	}
	
	public OrdemServico inserirOrdem(OrdemServico ordem) {
		return ordemServicoRepository.save(ordem);
	}
	
	public OrdemServico excluirOrdem(short id) {
		Optional<OrdemServico> ordemEncontrada = ordemServicoRepository.findById(id);
		ordemServicoRepository.delete(ordemEncontrada.get());
		return ordemEncontrada.get();
	}
}
