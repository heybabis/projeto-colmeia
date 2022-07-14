package com.colmeia.projetointegrador.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "agenda_retirada_produtos")
public class AgendaRetiradaDeProdutos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_retirada_produtos")
	private Long id;

	@NotBlank
	private Date data;

	@NotBlank
	private Date hora;

	@Column(name = "id_beneficario")
	private Integer idBeneficiario;

	@Column(name = "id_itens_retirado")
	private Long idItensRetirados;

	@Column(name = "id_centro_distribuicao")
	private Long idCentroDistribuicao;

	public AgendaRetiradaDeProdutos(Long id, @NotBlank Date data, @NotBlank Date hora, Integer idBeneficiario,
			Long idItensRetirados, Long idCentroDistribuicao) {
		this.id = id;
		this.data = data;
		this.hora = hora;
		this.idBeneficiario = idBeneficiario;
		this.idItensRetirados = idItensRetirados;
		this.idCentroDistribuicao = idCentroDistribuicao;
	}
	
	/*public void agendarRetirada() {
		
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Integer getIdBeneficiario() {
		return idBeneficiario;
	}

	public void setIdBeneficiario(Integer idBeneficiario) {
		this.idBeneficiario = idBeneficiario;
	}

	public Long getIdItensRetirados() {
		return idItensRetirados;
	}

	public void setIdItensRetirados(Long idItensRetirados) {
		this.idItensRetirados = idItensRetirados;
	}

	public Long getIdCentroDistribuicao() {
		return idCentroDistribuicao;
	}

	public void setIdCentroDistribuicao(Long idCentroDistribuicao) {
		this.idCentroDistribuicao = idCentroDistribuicao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, hora, id, idBeneficiario, idCentroDistribuicao, idItensRetirados);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgendaRetiradaDeProdutos other = (AgendaRetiradaDeProdutos) obj;
		return Objects.equals(data, other.data) && Objects.equals(hora, other.hora) && Objects.equals(id, other.id)
				&& Objects.equals(idBeneficiario, other.idBeneficiario)
				&& Objects.equals(idCentroDistribuicao, other.idCentroDistribuicao)
				&& Objects.equals(idItensRetirados, other.idItensRetirados);
	}

}
