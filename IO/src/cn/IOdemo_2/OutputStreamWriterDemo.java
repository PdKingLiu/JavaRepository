package cn.IOdemo_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("file2.txt"), "GBK");
		int ch = 0;
		// while((ch=isr.read())!=-1) {
		// System.out.print((char)ch);
		// }
		// isr.close();
		System.out.println("------------------------");
		char[] c = new char[1024];
		while ((ch = isr.read(c)) != -1) {
			System.out.print(new String(c, 0, ch));
		}
		isr.close();
	}

}
