package br.com.gabbank.banco.modelo;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) {
		super.saca(valor);
	}

	@Override
	public void transfere(double valor, Conta destino) {
		double valorTransfere = valor + 0.3;
		super.transfere(valorTransfere, destino);
	}
	
	@Override
	public String toString() {
		return "Conta Corrente: " + super.toString();
	}

}
