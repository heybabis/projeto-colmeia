package com.colmeia.projetointegrador.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "tb_Doador")

public class Doador extends Usuario {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDoador")
	private Long idDoador;
	
	@NotBlank
	@Size(max=20)
	@Column(name="nomeDoador")
	private String nome;
	
	
		
	public Doador(Long id, String nome, String sobrenone, String nomeSocial, String email, @NotBlank @CPF @Size(max = 11) String cpf, String telefone) {
		super(id, nome, sobrenone, nomeSocial, email, cpf, telefone);
	
	}

	
	
}
