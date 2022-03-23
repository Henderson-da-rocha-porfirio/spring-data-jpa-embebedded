package com.tuyo.componentmapping.repository;

import com.tuyo.componentmapping.entities.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {

}
