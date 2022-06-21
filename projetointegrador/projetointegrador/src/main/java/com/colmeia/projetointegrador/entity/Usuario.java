package com.colmeia.projetointegrador.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "tb_Usuarios")

public abstract class Usuario  implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUsuário")
	private Long idUsuario;
	
	@NotBlank
	@Size(max=20)
	@Column(name="nomeUsuário")
	private String nome;
	
	@NotBlank
	@Size(max=40)
	@Column(name="sobrenomeUsuário")
	private String sobrenome;
	
	
	@NotBlank
	@Size(max=35)	
	@Column(name="nomesocialUsuário")
	private String nomeSocial;
	
	@NotBlank
	@Size(max=80)
	@Email
	@Column(name="emailUsuario")
	private String email;

	@NotBlank
	@Size(max=11)
	@Column(name="CPFlUsuario")
	private int cpf;

	//@NotBlank
	//@Size(max=80)
	//@Email
	//@Column(name="enderecolUsuario")
	//private  List<Endereco>enderecos = new ArrayList<Endereco>();;

	@NotBlank
	@Size(max=11)
	@Value("telefone")
	private String telefone;
	
	public Usuario(Long idUsuario, String nome, String sobrenone, String nomeSocial, String email, int cpf, String telefone) {	
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		
		
	}
}
