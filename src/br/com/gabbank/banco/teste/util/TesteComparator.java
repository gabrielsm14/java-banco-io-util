package br.com.gabbank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.gabbank.banco.teste.util.TitularDaContaComparator;
import br.com.gabbank.banco.modelo.Cliente;
import br.com.gabbank.banco.modelo.Conta;
import br.com.gabbank.banco.modelo.ContaCorrente;
import br.com.gabbank.banco.modelo.ContaPoupanca;

/**
 * 
 * @author Gabriel Mendonça
 * 
 * Testa para chamar os metodos e executado-los, commparado contas
 *
 */

public class TesteComparator {
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(77, 88);
		Cliente clienteCC = new Cliente();
		clienteCC.setNome("Gabi");
		cc.setTitular(clienteCC);
		cc.deposita(888.0);
		
		Conta cc1 = new ContaCorrente(77, 55);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Gabriel");
		cc1.setTitular(clienteCC1);
		cc1.deposita(555.0);
		
		Conta cp = new ContaPoupanca(77, 11);
		Cliente clienteCP = new Cliente();
		clienteCP.setNome("Gui");
		cp.setTitular(clienteCP);
		cp.deposita(111.0);
		
		Conta cp1 = new ContaPoupanca(77, 33);
		Cliente clienteCP1 = new Cliente();
		clienteCP1.setNome("Eliz");
		cp1.setTitular(clienteCP1);
		cp1.deposita(333.0);
		
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc);
		lista.add(cc1);
		lista.add(cp);
		lista.add(cp1);
		
		lista.sort(new NumeroDaContaComparator());
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		//Collections.reverse(lista);
		lista.sort(new TitularDaContaComparator());
	    //lista.sort(null);
		
		System.out.println("-------------");
		
		for(Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}
	}
}

/**
 * 
 * @author Gabriel Mendonça
 * 
 * Essa class compara os titulares da conta, coloca os nomes em ordem alfabetica 
 *
 */


class TitularDaContaComparator implements Comparator<Conta> {
	
	@Override
		public int compare(Conta cc, Conta cc1) {
		String nomecc = cc.getTitular().getNome();
		String nomecc1 = cc1.getTitular().getNome();
			return nomecc.compareTo(nomecc1);
		}
}

/**
 * 
 * @author Gabriel Mendonça
 * 
 * A ideia desse metodo é definir qual a conta maior que a outra, o criterio
 * depende do desenvolvedor pode ser baseado no saldo, ou no agencia, numero e
 * etc.
 * 
 * Neste código foi comparado o numero
 * 
 */

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta cc, Conta cc1) {
		return Integer.compare(cc.getNumero(), cc1.getNumero()); 
	}
}







