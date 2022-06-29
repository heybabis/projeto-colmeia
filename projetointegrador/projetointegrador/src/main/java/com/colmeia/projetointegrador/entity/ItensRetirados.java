package com.colmeia.projetointegrador.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_Produtos")

public class ItensRetirados {
	
	
	@Column(name="Produtos")	
	private  List<Produto>produtos = new ArrayList<Produto>();
	
	@Column(name="idProduto")
	private Long idProduto;
	
	@Column(name="idBeneficiario")
	private Long idBeneficiario;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idItensRetirados")
	private Long idItensRetirados;
	
}
