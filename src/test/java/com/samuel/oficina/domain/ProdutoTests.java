package com.samuel.oficina.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTests {
	@Test
	public void criar() {
		Cargo cargo1 = new Cargo();
		cargo1.setId(Short.valueOf("1"));
		cargo1.setNome("Atendente");
		
	}
}
