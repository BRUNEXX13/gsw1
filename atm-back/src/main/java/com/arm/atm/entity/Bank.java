package com.arm.atm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "bank")
public class Bank {

	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonInclude(Include.NON_NULL)
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Bank(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Bank() {
		super();
	}

//	@OneToMany(mappedBy = "bank") // Um Determinado Autor pode ter varios livros
//	@JsonIgnore // Na hora de Listar um autor, eu nao vou listar o livros deles.
//	private List<Account> accounts;

	
	
	
	

}
