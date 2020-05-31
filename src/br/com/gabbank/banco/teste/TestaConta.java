package br.com.gabbank.banco.teste;

import br.com.gabbank.banco.modelo.Cliente;
import br.com.gabbank.banco.modelo.Conta;
import br.com.gabbank.banco.modelo.ContaCorrente;
import br.com.gabbank.banco.modelo.ContaPoupanca;

public class TestaConta {
	public static void main(String[] args) {
		
		Cliente gui = new Cliente();
		gui.nome = "Guilherme";
	    System.out.println(gui.nome);

		ContaCorrente cc = new ContaCorrente(6666, 33333);
		cc.deposita(50);
		System.out.println(cc.getSaldo());
		
		Conta cp = new ContaPoupanca(222, 555);		
		cp.deposita(100);
		System.out.println(cp.getSaldo());	
		
		System.out.println(cc);
		System.out.println(cp);	
		
		
	
		
		
		
	}

}
