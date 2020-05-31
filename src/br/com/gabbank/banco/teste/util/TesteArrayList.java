package br.com.gabbank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.gabbank.banco.modelo.Conta;
import br.com.gabbank.banco.modelo.ContaCorrente;
import br.com.gabbank.banco.modelo.ContaPoupanca;

public class TesteArrayList {
	
	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<Conta>(); // Com o List deixa o código mais generico 
		
		Conta cc = new ContaCorrente(222, 5522);
		lista.add(cc);
		
		Conta cp = new ContaPoupanca(333, 4422);
		lista.add(cp);
		
		Conta cc2 = new ContaCorrente(666, 4444);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
	    Conta pos = lista.get(1);
	    System.out.println("Tamanha: " + pos.getNumero());
	    //lista.remove(0);
	    
	    for(int i = 0; i < lista.size(); i++) {
	    	pos = lista.get(i);
	    	System.out.println(pos);
	    }
	    System.out.println("-----------------");
	    
	    for(Conta conta : lista) {
	    	System.out.println(conta);
	    }
	}

}
