package com.samuel.oficina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.oficina.domain.Servico;
import com.samuel.oficina.repository.ServicoRepository;

@Service
public class ServicoService {
	@Autowired
	private ServicoRepository servicoRepository;
	
	public List<Servico> listarTodasServico() {
		List<Servico> servico = servicoRepository.findAll();
		if (servico.isEmpty()) {
			throw new RuntimeException("Não existem serviços cadastrados.");
		}
		return servico;
	}
	
	public Servico inserirServico(Servico Servico) {
		return servicoRepository.save(Servico);
	}
	
	public Servico excluirServico(short id) {
		Optional<Servico> ServicoEncontrado = servicoRepository.findById(id);
		servicoRepository.delete(ServicoEncontrado.get());
		return ServicoEncontrado.get();
	}
}
