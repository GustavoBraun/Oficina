package com.samuel.oficina.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;
import lombok.Setter;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
@Getter
@Setter
public class BusinessException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public BusinessException(String message) {
		super(message);
	

	}
}
