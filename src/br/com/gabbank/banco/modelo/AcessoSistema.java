package br.com.gabbank.banco.modelo;

public class AcessoSistema {
	
	private int senha = 444;

	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema");
		}else {
			System.out.println("Não poe netrar no sistema");
		}
	}

}
