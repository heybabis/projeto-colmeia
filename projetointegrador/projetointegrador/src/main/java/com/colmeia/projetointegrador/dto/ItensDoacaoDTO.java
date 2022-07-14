package com.colmeia.projetointegrador.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.colmeia.projetointegrador.entity.ItensDoacao;
import com.colmeia.projetointegrador.entity.Produto;

public class ItensDoacaoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long idDoador;
	private Long idCentroDeDistribuicao;
	private Integer quantidade;
	
	private List<Produto> produtos = new ArrayList<>();

	public ItensDoacaoDTO(ItensDoacao itensDoacao) {
		this.id = itensDoacao.getId();
		this.idDoador = itensDoacao.getIdDoador();
		this.idCentroDeDistribuicao = itensDoacao.getIdCentroDeDistribuicao();
		this.quantidade = itensDoacao.getQuantidade();
		this.produtos = itensDoacao.getProdutos();

	}

	public static List<ItensDoacaoDTO> converterLista(List<ItensDoacao> itensDoacao) {
		return itensDoacao.stream().map(ItensDoacaoDTO::new).collect(Collectors.toList());
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
		ItensDoacaoDTO other = (ItensDoacaoDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(idCentroDeDistribuicao, other.idCentroDeDistribuicao)
				&& Objects.equals(idDoador, other.idDoador) && Objects.equals(produtos, other.produtos)
				&& Objects.equals(quantidade, other.quantidade);
	}

}
