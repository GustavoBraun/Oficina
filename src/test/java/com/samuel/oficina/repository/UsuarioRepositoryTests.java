package com.samuel.oficina.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.samuel.oficina.domain.Cargo;
import com.samuel.oficina.domain.Usuario;

@SpringBootTest
public class UsuarioRepositoryTests {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private CargoRepository cargoRepository;
	
	
	@Test
	public List<Usuario> listar() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios;
	}
	
	@Test
	public void inserir() {
		
		Cargo cargo1 = new Cargo(null,
				"mecanica"
				);
		
		Usuario usuario1 = new Usuario(null,
				"Aloe",
				"badasslion@gmail.com",
				"annieteamo",
				cargo1
				);
		
		
		cargoRepository.save(cargo1);
		usuarioRepository.save(usuario1);
		
		
	}
	
	
}
