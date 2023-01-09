package com.samuel.oficina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.oficina.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Short>{

	Optional<Cliente> findByCPF(String CPF);
	
}
