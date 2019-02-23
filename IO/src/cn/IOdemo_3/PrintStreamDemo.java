package cn.IOdemo_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo {

	public static void main(String[] args) throws IOException {
		PrintWriter printWriter = new PrintWriter(new FileWriter("Copy.txt"),true);
		BufferedReader bufferedReader = new BufferedReader(new FileReader("file3.txt"));
		String str = null;
		while((str=bufferedReader.readLine())!=null) {
			printWriter.println(str);
		}
	}

}
