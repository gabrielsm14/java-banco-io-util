package br.com.gabbank.banco.teste.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWrite {

	public static void main(String[] args) throws IOException {

		// BufferedWriter bw = new BufferedWriter(new FileWriter("tecnologia2.txt"));
		// PrintStream ps = new PrintStream(new File("tecnologia2.rxt"));

		PrintWriter ps = new PrintWriter("tecnologia2.txt");
		
		ps.println("jndjk fkdjfkdfj djfkjskfs ");
		ps.println();
		ps.println("kfmdkfkdfj fjdjdkkddddddddddddddd");

		ps.close();
	}

}
