package com.samuel.oficina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.oficina.domain.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Short> {

}
