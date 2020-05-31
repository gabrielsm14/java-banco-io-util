package br.com.gabbank.banco.modelo;

public class Gerente extends Funcionario implements Autenticavel {

	private Autenticacao autenticacao;

	public Gerente() {
		this.autenticacao = new Autenticacao();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticacao.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticacao.autentica(senha);
	}


	

}
