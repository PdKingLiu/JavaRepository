package cn.itcast_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.1.192", 17299);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String str =null;
		while((str = br.readLine())!=null) {
			if(str.equals("88")) {
				break;
			}
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
		br.close();
		s.close();
	}
}
