package cn.itcast_11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive {
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(12355);
		Socket s = ss.accept();
		BufferedInputStream bufferedInputStream = new BufferedInputStream(s.getInputStream());
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("copy.avi"));
		byte[] b = new byte[1024];
		int l;
		while((l=bufferedInputStream.read(b))!=-1) {
			bufferedOutputStream.write(b, 0, l);
			bufferedOutputStream.flush();
		}
		OutputStream outputStream = s.getOutputStream();
		outputStream.write("上传成功".getBytes());
		bufferedInputStream.close();
		bufferedOutputStream.close();
		s.close();
	}
}