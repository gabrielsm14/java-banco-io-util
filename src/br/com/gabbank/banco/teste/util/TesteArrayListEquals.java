package br.com.gabbank.banco.teste.util;

import java.util.ArrayList;

import br.com.gabbank.banco.modelo.Conta;
import br.com.gabbank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(666, 777);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(555, 333);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(555, 333);
		System.out.println("Já existe essa conta? " + lista.contains(cc3));
	}
}
