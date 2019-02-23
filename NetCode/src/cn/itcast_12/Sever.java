package cn.itcast_12;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(12355);
		while(true) {
			Socket s = ss.accept();
			new Thread(new UserThread(s)).start();
		}
	}
}
