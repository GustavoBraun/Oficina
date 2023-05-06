package com.samuel.oficina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.oficina.domain.Cliente;
import com.samuel.oficina.domain.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Short>{
    Optional<Veiculo> findByidCliente (Cliente idCliente);
}
