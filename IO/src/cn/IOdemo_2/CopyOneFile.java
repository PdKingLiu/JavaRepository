package cn.IOdemo_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CopyOneFile {

	public static void main(String[] args) throws IOException {
		File src = new File("F:\\÷‹±®");
		File des = new File("D:\\Copy");
		if(!des.exists()) {
			des.mkdir();
		}
		File[] ff = src.listFiles();
		for (File file : ff) {
			File newfile = new File(des,file.getName());
			copyfile(file,newfile);
		}
	}

	private static void copyfile(File file, File newfile) throws IOException {
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newfile));
		byte[] ch = new byte[1024];
		int l;
		while((l=bufferedInputStream.read(ch))!=-1) {
			bufferedOutputStream.write(ch, 0, l);
		}
	}

}
