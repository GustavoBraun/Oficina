package com.samuel.oficina.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import com.samuel.oficina.domain.Usuario;
import com.samuel.oficina.repository.UsuarioRepository;

@SpringBootTest
@WebAppConfiguration
@ExtendWith(SpringExtension.class)
public class UsuarioServiceTest {
	@Autowired
	private UsuarioService usuarioService;
	@Autowired 
	private UsuarioRepository usuarioRepository;
	
	@Test
	public void buscarUsuarioTest() {
	     Usuario usuario = usuarioService.buscarPorID(Short.valueOf("3"));
	     assertEquals("Aloe", usuario.getNome());
	     
	}
	
	@Test
	public void excluiUsuarioTest() {
		usuarioService.excluirUsuario(Short.valueOf("8"));
		Optional<Usuario> usuarioOptional = usuarioRepository.findById(Short.valueOf("8"));
		assertTrue(usuarioOptional.isEmpty());
	}
	
	@Test
	public void listarVeiculoTest() {
		List<Usuario> usuarios = usuarioService.listarTodosUsuarios();
		assertFalse(usuarios.isEmpty());
	}
}
