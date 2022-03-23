package com.tuyo.componentmapping;

import com.tuyo.componentmapping.entities.Funcionario;
import com.tuyo.componentmapping.entities.Endereco;
import com.tuyo.componentmapping.repository.FuncionarioRepository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ComponentmappingApplicationTests {

	@Autowired
	FuncionarioRepository repository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreate() {
		Funcionario funcionario = new Funcionario();
		funcionario.setId(123);
		funcionario.setName("John");
		Endereco endereco = new Endereco();
		endereco.setCity("Austin");
		endereco.setStreetaddress("Spicewood Springs");
		endereco.setCountry("USA");
		endereco.setState("TEXAS");
		endereco.setZipcode("78750");
		funcionario.setAddress(endereco);

		repository.save(funcionario);
	}

}
