package cn.itcast_12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Send {
	public static void main(String[] args) throws IOException{
		Socket s = new Socket("192.168.1.192", 12355);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(s.getOutputStream());
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("27.avi"));
		byte[] b = new byte[1024];
		int len;
		while((len=bufferedInputStream.read(b))!=-1) {
			bufferedOutputStream.write(b,0,len);
			bufferedOutputStream.flush();
		}
		s.shutdownOutput();
		InputStream inputStream = s.getInputStream();
		int l;
		byte[] b2=new byte[1024];
		l=inputStream.read(b2);
		String ss = new String(b2,0,l);
		System.out.println(ss);
		bufferedInputStream.close();
		bufferedOutputStream.close();
	}
}
