package br.com.gabbank.banco.teste.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("tecnologia2.txt"));
		bw.write("kakjdf kadjkfj kdfalfkeo oekofkslç");
		bw.newLine();
		bw.newLine();
		bw.write("kfjdkafj fjkdfjldmk fkdfm");
		
		bw.close();
	}

}
