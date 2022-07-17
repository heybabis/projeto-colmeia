package com.colmeia.projetointegrador.entity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_itens_doacao")
public class ItensDoacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_itens_doacao")
	private Long id;

	@Column(name = "id_doador")
	private Long idDoador;

	@Column(name = "id_centro_distribuicao")
	private Long idCentroDeDistribuicao;

	@NotBlank
	private Integer quantidade;

	private List<Produto> produtos = new ArrayList<>();

	public ItensDoacao(Long id, Long idDoador, Long idCentroDeDistribuicao, @NotBlank Integer quantidade,
			List<Produto> produtos) {
		this.id = id;
		this.idDoador = idDoador;
		this.idCentroDeDistribuicao = idCentroDeDistribuicao;
		this.quantidade = quantidade;
		this.produtos = produtos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdDoador() {
		return idDoador;
	}

	public void setIdDoador(Long idDoador) {
		this.idDoador = idDoador;
	}

	public Long getIdCentroDeDistribuicao() {
		return idCentroDeDistribuicao;
	}

	public void setIdCentroDeDistribuicao(Long idCentroDeDistribuicao) {
		this.idCentroDeDistribuicao = idCentroDeDistribuicao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idCentroDeDistribuicao, idDoador, produtos, quantidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItensDoacao other = (ItensDoacao) obj;
		return Objects.equals(id, other.id) && Objects.equals(idCentroDeDistribuicao, other.idCentroDeDistribuicao)
				&& Objects.equals(idDoador, other.idDoador) && Objects.equals(produtos, other.produtos)
				&& Objects.equals(quantidade, other.quantidade);
	}
}
