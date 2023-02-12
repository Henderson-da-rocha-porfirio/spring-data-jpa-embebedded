package com.tuyo.componentmapping.entities;

import javax.persistence.*;

@Entity
public class Funcionario { // Aqui é usado @Embedded na variável para dizer ao hibernate que este objeto em particular, Endereço, deveria ser Embedded ( imbutido )
							// no objeto Funcionario quando ele for salvo, e Endereço, ser salvo também na mesma tabela. E para isso usamos @Embeddable na classe Endereço.
	@Id
	private int id;
	private String name;
	@Embedded
	private Endereco endereco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Endereco getAddress() {
		return endereco;
	}

	public void setAddress(Endereco endereco) {
		this.endereco = endereco;
	}

}
