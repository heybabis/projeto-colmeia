package com.colmeia.projetointegrador.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_ItensDoacao")

public class ItensDoacao {

		
	public  List<Produto>produtos = new ArrayList<Produto>();
	
	private Doador doador;

	
	//private Pedido pedido;
	//Aqui tínhamos falado sobre criar um id de pedido....mas fiquei com dúvida
	
	
}
