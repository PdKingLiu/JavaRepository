package cn.itcast_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.1.192", 8888);
		BufferedReader br = new BufferedReader(
				new FileReader("D:\\eclipse-workspace\\NetCode\\src\\cn\\itcast_02\\ReceiveDemo.java"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
 
		String str = null;
		while ((str = br.readLine()) != null) {
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
		br.close();
		s.close();
	}
}
