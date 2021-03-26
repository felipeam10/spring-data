package br.com.felipe.spring.data.specification;

import org.springframework.data.jpa.domain.Specification;

import br.com.felipe.spring.data.orm.Funcionario;

public class SpecificationFuncionario {

	public static Specification<Funcionario> nome(String nome) {
		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("nome"), "%" + nome + "%");
	}
}
