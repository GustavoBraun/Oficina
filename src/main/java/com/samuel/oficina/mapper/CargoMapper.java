package com.samuel.oficina.mapper;

import com.samuel.oficina.domain.Cargo;
import com.samuel.oficina.request.CargoRequest;
import com.samuel.oficina.response.CargoResponse;

public class CargoMapper {
	public static Cargo toCargo(CargoRequest request) {
		
		Cargo cargo = new Cargo();
		cargo.setId(request.getId());
		cargo.setNome(request.getNome());
		return cargo;
	}
	
	public static CargoResponse toCargoResponse(Cargo cargo) {
		CargoResponse cargoresponse = new CargoResponse();
		cargoresponse.setId(cargo.getId());
		cargoresponse.setNome(cargo.getNome());
		return cargoresponse;
	}
}
