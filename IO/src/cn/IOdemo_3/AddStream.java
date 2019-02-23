package cn.IOdemo_3;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

public class AddStream {

	public static void main(String[] args) throws IOException {
		InputStream s1 = new FileInputStream("file3.txt");
		InputStream s2 = new FileInputStream("file5.txt");
		SequenceInputStream inputStream = new SequenceInputStream(s1, s2);
		BufferedOutputStream bufferedWriter = new BufferedOutputStream(new FileOutputStream("copyadd.txt"));
		byte[] bs = new byte[1024];
		int l;
		while((l=inputStream.read(bs))!=-1) {
			bufferedWriter.write(bs, 0, l);
		}
		bufferedWriter.close();
	}

}
