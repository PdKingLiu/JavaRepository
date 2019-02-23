package cn.IOdemo_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("file.txt"));
		outputStream.write("123".getBytes());
		outputStream.close();
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("file2.txt"));
		byte[] b = new byte[1024]; 
		int len=0;
		while((len=bufferedInputStream.read(b))!=-1) {
			System.out.print(new String(b,0,len));
		}
		bufferedInputStream.close();
	}

}
