package com.samuel.oficina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.oficina.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Short>{

}
