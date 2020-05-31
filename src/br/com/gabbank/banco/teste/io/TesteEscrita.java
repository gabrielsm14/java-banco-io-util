package br.com.gabbank.banco.teste.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		OutputStream fos = new FileOutputStream("tecnologia2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("jaksfjdaf skadjka ldksd dls,dlsdd,asdksadka lça");
		bw.newLine();
		bw.newLine();
		bw.write("mjnak jieoiwpa  fjfj fa´f ");
		
		bw.close();
	}

}
