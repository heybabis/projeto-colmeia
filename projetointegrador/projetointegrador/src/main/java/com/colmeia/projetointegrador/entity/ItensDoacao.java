package com.colmeia.projetointegrador.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_ItensDoacao")

public class ItensDoacao {
	
	@OneToMany(cascade=CascadeType.ALL)
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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Long getIdDoador() {
		return idDoador;
	}

	public void setIdDoador(Long idDoador) {
		this.idDoador = idDoador;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public Long getIdUtensDiacao() {
		return idUtensDiacao;
	}

	public void setIdUtensDiacao(Long idUtensDiacao) {
		this.idUtensDiacao = idUtensDiacao;
	}
	
			
	
}
