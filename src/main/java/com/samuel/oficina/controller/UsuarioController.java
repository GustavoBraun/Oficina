package com.samuel.oficina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.oficina.domain.Usuario;
import com.samuel.oficina.mapper.UsuarioMapper;
import com.samuel.oficina.request.UsuarioRequest;
import com.samuel.oficina.response.UsuarioResponse;
import com.samuel.oficina.service.UsuarioService;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> listarUsuarios() {
		return usuarioService.listarTodosUsuarios();
	}
	
	@GetMapping("/{id}")
	public UsuarioResponse buscaUsuarioPorId(@PathVariable Short id) {
		return UsuarioMapper.toUsuarioResponse(usuarioService.buscarPorID(id));
	}
	
	@PostMapping
	public UsuarioResponse inserirUsuario(@RequestBody UsuarioRequest request) {
		
		Usuario usuario = UsuarioMapper.toUsuario(request);
		
		Usuario usuarioSalvo = usuarioService.inserir(usuario);
		
		UsuarioResponse usuarioResponse = UsuarioMapper.toUsuarioResponse(usuarioSalvo);
		
		return usuarioResponse;
	}
	
	@DeleteMapping("/{id}")
	public UsuarioResponse excluirUsuario(@PathVariable Short id) {
		return UsuarioMapper.toUsuarioResponse(usuarioService.excluirUsuario(id));
	}
	
	@PutMapping
	public UsuarioResponse editarUsuario(@RequestBody UsuarioRequest request) {
		
		Usuario usuario = UsuarioMapper.toUsuario(request);
		
		Usuario usuarioSalvo = usuarioService.inserir(usuario);
		
		UsuarioResponse usuarioResponse = UsuarioMapper.toUsuarioResponse(usuarioSalvo);
		
		return usuarioResponse;
	}
}

