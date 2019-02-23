package cn.IOdemo_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Sort {
	public static void main(String[] args) throws IOException {
		BufferedReader bbr = new BufferedReader(new FileReader("File5.txt"));
		String s = bbr.readLine();
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		BufferedWriter bbw = new BufferedWriter(new FileWriter("File5.txt"));
		bbw.write(ch, 0, ch.length);
		bbw.flush();
		bbr.close();
		bbw.close();
	}
}
