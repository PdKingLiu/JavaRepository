package cn.IOdemo_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamDemo {
	public static void main(String[] args) throws IOException {
		// FileInputStream fis = new FileInputStream("file.txt");
		// int ch= fis.read();
		// System.out.println((char)ch);
		// int ch;
		// while((ch=fis.read())!=-1) {
		// System.out.print((char)ch);
		// }
		// FileInputStream fis = new FileInputStream("file.txt");
		// FileOutputStream fis2 = new FileOutputStream("file2.txt");
		// int ch;
		// while ((ch = fis.read()) != -1) {
		// fis2.write(ch);
		// }
		// fis.close();
		// fis2.close();

		FileInputStream fis = new FileInputStream("C:\\Users\\刘沛栋\\Pictures\\Camera Roll\\22.jpg");
		FileOutputStream fis2 = new FileOutputStream("D:\\1.jpg");
		//第一种
		// int ch;
		// while ((ch = fis.read()) != -1) {
		// fis2.write(ch);
		// }
		// fis.close();
		// fis2.close();
		
		//第二种
		byte[] b= new byte[1024];
		int l=0;
		while((l=fis.read(b))!=-1) {
			fis2.write(b,0,l);
		}
		 fis.close();
		 fis2.close();
	}
}
