package cn.itcast_05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException{
		Socket s = new Socket("192.168.1.192", 8888);
		OutputStream os = s.getOutputStream();
		os.write("Lpp".getBytes());
		s.close();
	}
}
