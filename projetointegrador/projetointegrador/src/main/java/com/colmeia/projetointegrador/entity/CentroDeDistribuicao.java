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
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_centroDeDistribuicao")
public class CentroDeDistribuicao implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_centroDeDistribuicao")
	private Long id;
// 
	@NotBlank
	@Size(max=80)
	@Column(name="funcionario")
	private  List<Funcionario>funcionarios = new ArrayList<Funcionario>();

	@Size(max=80)
	@Column(name="endereco")
	private  List<Endereco>enderecos = new ArrayList<Endereco>();

	public CentroDeDistribuicao(Long id, List<Endereco> enderecos) {
		this.id = id;
		this.enderecos = enderecos;
	}

	public CentroDeDistribuicao(Long id, List<Funcionario> funcionarios, List<Endereco> enderecos) {
		this.id = id;
		this.funcionarios = funcionarios;
		this.enderecos = enderecos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;
		if (!super.equals(object)) return false;
		CentroDeDistribuicao that = (CentroDeDistribuicao) object;
		return java.util.Objects.equals(id, that.id) && java.util.Objects.equals(funcionarios, that.funcionarios) && java.util.Objects.equals(enderecos, that.enderecos);
	}
	@Override
	public int hashCode() {
		return java.util.Objects.hash(super.hashCode(), id, funcionarios, enderecos);
	}
}
