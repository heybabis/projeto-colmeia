package com.colmeia.projetointegrador.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_Produtos")

public class ItensRetirados {
	
	@OneToMany
	@Column(name="Produtos")	
	private  List<Produto>produtos = new ArrayList<Produto>();
	
	@Column(name="idProduto")
	private Long idProduto;
	
	@OneToOne
	@Column(name="idBeneficiario")
	private Long idBeneficiario;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idItensRetirados")
	private Long idItensRetirados;


	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}


	public Long getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}


	public Long getIdBeneficiario() {
		return idBeneficiario;
	}


	public void setIdBeneficiario(Long idBeneficiario) {
		this.idBeneficiario = idBeneficiario;
	}


	public Long getIdItensRetirados() {
		return idItensRetirados;
	}


	public void setIdItensRetirados(Long idItensRetirados) {
		this.idItensRetirados = idItensRetirados;
	}
	

}
