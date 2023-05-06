package com.samuel.oficina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.oficina.domain.Cargo;
import com.samuel.oficina.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Short>{
    Optional<Usuario> findByIdcargo(Cargo idCargo);
}
