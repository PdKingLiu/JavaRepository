package cn.itcast_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);

		Socket s = ss.accept();

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy.java"));
		String str = null;
		while ((str = br.readLine()) != null) {
			bw.write(str);
			bw.newLine();
			bw.flush();
			System.out.println(str);
		}
		BufferedWriter b2 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		b2.write("上传成功");
		b2.newLine();
		b2.flush();
		s.close();
	}
}