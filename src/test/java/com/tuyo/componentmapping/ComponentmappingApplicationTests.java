package com.tuyo.componentmapping;

import com.tuyo.componentmapping.entities.*;
import com.tuyo.componentmapping.repository.*;
import org.junit.jupiter.api.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;

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
