package com.colmeia.projetointegrador.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_enderecos")
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long id;

	@NotBlank
	@Size(max = 50)
	@Column(name = "logradouro")
	private String logradouro;

	@NotBlank
	@Size(max = 4)
	@Column(name = "numero")
	private String numero;

	@NotBlank
	@Size(max = 8)
	@Column(name = "cep")
	private String cep;

	@NotBlank
	@Column(name = "bairro")
	private String bairro;

	@Column(name = "complemento")
	private String complementoEndereco;

	@NotBlank
	@Size(max = 30) // maior cidade do br tem 29 caracteres
	@Column(name = "cidade")
	private String cidade;

	public Endereco(Long id, @NotBlank @Size(max = 50) String logradouro, @NotBlank @Size(max = 4) String numero,
			@NotBlank @Size(max = 8) String cep, @NotBlank String bairro, String complementoEndereco,
			@NotBlank @Size(max = 30) String cidade) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.complementoEndereco = complementoEndereco;
		this.cidade = cidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplementoEndereco() {
		return complementoEndereco;
	}

	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, logradouro, numero, cep, bairro, complementoEndereco, cidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(id, other.id) && Objects.equals(logradouro, other.logradouro)
				&& Objects.equals(numero, other.numero) && Objects.equals(cep, other.cep)
				&& Objects.equals(bairro, other.bairro)
				&& Objects.equals(complementoEndereco, other.complementoEndereco)
				&& Objects.equals(cidade, other.cidade);
	}

}
