package com.colmeia.projetointegrador.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_ItensDoação")

public interface ItensDoacao {

		
	@Column(name="Produtos")
	public  List<Produtos>produto = new ArrayList<Produtos>();
	
	public static final Long idUsuario = null;

	public static final Long idProduto = null;
	
	
	//DUVIDAS AQUI!!//
	
}
