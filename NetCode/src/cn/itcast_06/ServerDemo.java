package cn.itcast_06;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		ServerSocket ss = new ServerSocket(17299);
		Socket sk = ss.accept();
		InputStream is = sk.getInputStream();
		byte[] b = new byte[1024];
		int len = is.read(b);
		String S = new String(b, 0, len);
		System.out.println(sk.getInetAddress().getHostAddress() + " " + S);
		for (int i = 0; i < 10; i++) {
			OutputStream op = sk.getOutputStream();
			op.write(("Ok "+"\n").getBytes());
			op.close();
		}

	}
}