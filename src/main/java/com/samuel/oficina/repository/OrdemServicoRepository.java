package com.samuel.oficina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.oficina.domain.OrdemServico;
import com.samuel.oficina.domain.Veiculo;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Short>{
    Optional<OrdemServico> findByidVeiculo (Veiculo idVeiculo);
}
