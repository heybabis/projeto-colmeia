package com.colmeia.projetointegrador.entity;

public class Beneficiario extends Usuario {
	
	private static final long serialVersionUID = 1L;
	
	public boolean restricaoAlimentar;
	
	public boolean necessidadeEspacialHigiene;
	
	public int qteDependentes;
	
	//Agenda de retirada de produtos.
	
	
	public Beneficiario(Long idUsuario, String nome, String sobrenone, String nomeSocial, String email, int cpf,
			String telefone) {
		super(idUsuario, nome, sobrenone, nomeSocial, email, cpf, telefone);
		// TODO Auto-generated constructor stub
	}

	public Object selecionarCentroDistribuiçao(){
		return null;
		
	}

	public Object selecionarItens() {
		return null;
	}
}
