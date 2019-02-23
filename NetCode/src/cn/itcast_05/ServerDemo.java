package cn.itcast_05;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		Socket sk = ss.accept();
		InputStream is = sk.getInputStream();
		byte[] b = new byte[1024];
		int len = is.read(b);
		String S = new String(b, 0, len);
		System.out.println(sk.getInetAddress().getHostAddress() + " " + S);
	}
}