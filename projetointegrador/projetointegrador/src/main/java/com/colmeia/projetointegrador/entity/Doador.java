package com.colmeia.projetointegrador.entity;

public class Doador extends Usuario implements ItensDoacao{
	
	private static final long serialVersionUID = 1L;
	
		
	public Doador(Long id, String nome, String sobrenone, String nomeSocial, String email, int cpf, String telefone) {
		super(id, nome, sobrenone, nomeSocial, email, cpf, telefone);
	
	}

	public Object doarItens() {
		return null;
	}
	

	
	
}