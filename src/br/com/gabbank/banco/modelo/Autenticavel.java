package br.com.gabbank.banco.modelo;

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	
	public abstract boolean autentica(int senha);

}
