package br.com.gabbank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void saca(double valor) {
		super.saca(valor);
	}
	
	@Override
	public String toString() {		
		return "Conta Poupança: " + super.toString();
	}
	
	

}
