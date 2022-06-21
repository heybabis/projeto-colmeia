package com.colmeia.projetointegrador.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_Produtos")

public abstract class Produtos  implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idProduto")
	private Long idProduto;
	

	@NotBlank
	@Size(max=20)
	@Column(name="nomeItem")
	private String nomeItem;
	
	@NotBlank
	@Column(columnDefinition ="qtde")
	private int quantidade;
	
	
	@NotBlank
	@Size(max=20)
	@Column(name="categoria")
	private String categoria;
	//Aqui, gostaria de ter as opções: higiene ou alimentação - ????
		
}
