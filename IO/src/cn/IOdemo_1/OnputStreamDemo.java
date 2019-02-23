package cn.IOdemo_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OnputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream name = new FileOutputStream("file.txt");
		name.write("hello".getBytes());
		FileOutputStream name2 = new FileOutputStream("file.txt",true);
		name2.write(" world".getBytes());
		name.close();
		name2.close();

		
	}

}
