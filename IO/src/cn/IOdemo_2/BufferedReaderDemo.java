package cn.IOdemo_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("file2.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("file4.txt"));
		char[] ch = new char[1024];
		String s = null;
		while ((s = br.readLine()) != null) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
