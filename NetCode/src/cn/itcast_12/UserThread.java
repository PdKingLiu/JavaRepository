package cn.itcast_12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UserThread implements Runnable {
	private Socket s;

	public UserThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			BufferedInputStream bufferedInputStream = new BufferedInputStream(s.getInputStream());
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("copy.avi"));
			byte[] b = new byte[1024];
			int l;
			while ((l = bufferedInputStream.read(b)) != -1) {
				bufferedOutputStream.write(b, 0, l);
				bufferedOutputStream.flush();
			}
			OutputStream outputStream = s.getOutputStream();
			outputStream.write("上传成功".getBytes());
			bufferedInputStream.close();
			bufferedOutputStream.close();
			s.close();
		} catch (Exception e) {

		}
	}
}
