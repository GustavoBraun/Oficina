package com.samuel.oficina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.samuel.oficina.domain.Usuario;
import com.samuel.oficina.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public List<Usuario> listarTodosUsuarios() {
		List<Usuario> todosOsUsuarios = usuarioRepository.findAll();
		
		if (todosOsUsuarios.isEmpty()) {
			throw new RuntimeException("Não existem usuários cadastrados.");
		}
		return todosOsUsuarios;
	}
	
	public Usuario buscarPorID(Short id) {
		Optional<Usuario> usuarioEncontrado = usuarioRepository.findById(id);
		if (usuarioEncontrado.isEmpty()) {
			throw new RuntimeException("Usuário não encontrado.");
		}
		Usuario usuario = usuarioEncontrado.get();
		return usuario;	
	}
	
	public Usuario inserir(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario excluirUsuario(Short id) {
		Optional<Usuario> usuarioEncontrado = usuarioRepository.findById(id);
		usuarioRepository.delete(usuarioEncontrado.get());
		return usuarioEncontrado.get();
	}
	
	public void editarUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
}
