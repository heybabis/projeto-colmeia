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
@Table(name = "tb_ItensDoacao")

public class ItensDoacao {

	@Column(name="Lista_Produtos")	
	private  List<Produto>produtos = new ArrayList<Produto>();
	
	@Column(name="idDoador")
	private Long idDoador;
	
	//@Column(name="idCentroDistribuicao")
	//private Long idCentroDeDistribuicao;
	
	@Column(name="quantidade")
	private int qtde;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idItensDoacao")
	private Long idUtensDiacao;
	
			
	
}
