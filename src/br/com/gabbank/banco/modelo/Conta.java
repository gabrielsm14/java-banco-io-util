package br.com.gabbank.banco.modelo;

import br.com.gabbank.banco.modelo.Conta;

public abstract class Conta implements Comparable<Conta> {
	
	protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    
    public Conta(int agencia, int numero) {
    	if(agencia < 1) {
    		throw new IllegalArgumentException("Agencia invalida");
    	}
    	if(numero < 1) {
    		throw new IllegalArgumentException("Numero da conta invalido");
    	}
    	this.agencia = agencia;
    	this.numero = numero;
    	this.saldo = 0;
    	//System.out.println("Criando uma conta " + this.numero);
    }
    
    // metodos
    public void deposita(double valor) {
    	this.saldo += valor;

    }
    
    public void saca(double valor) {
    	if(this.saldo < valor) {
    		throw new SaldoInsuficienteException("Saldo em conta: " + this.saldo + ", Valor a sacar: " + valor);
    	}
    	this.saldo -= valor;
    }
    	
    public void transfere(double valor, Conta destino) { 
            this.saca(valor);
    		destino.deposita(valor);
    }
    
    public double getSaldo() {
		return this.saldo;
	}
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero(int numero) {
    	if(numero < 0) {
    		System.out.println("Não pode ser menor que 0");
    		return;
    	}
    	this.numero = numero;
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
    	if(numero < 0) {
    		System.out.println("Não pode ser menor que 0");
    		return;
    	}
    	this.agencia = agencia;
    }
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
    
    @Override
    public boolean equals(Object obj) {
    	
    	Conta outra = (Conta) obj;
    	
    	if(this.agencia != outra.agencia) {
    		return false;
    	}
    	if(this.numero != outra.numero) {
    		return false;
    	}
    	return true;
    }
    
    @Override
	public int compareTo(Conta outra) { // ordem natural 
		return Double.compare(this.saldo, outra.saldo);
	}
    
    @Override
    public String toString() {
    	return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
    }
    
}
