package br.com.gabbank.banco.teste;

import br.com.gabbank.banco.modelo.Conta;
import br.com.gabbank.banco.modelo.ContaCorrente;
import br.com.gabbank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200);
		try {
		  conta.saca(300);
		}catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}
