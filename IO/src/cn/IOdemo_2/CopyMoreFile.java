package cn.IOdemo_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyMoreFile {

	public static void main(String[] args) throws Exception {
		File src = new File("F:\\Java\\JavaÔ´´úÂë\\corejava");
		File des = new File("D:\\Copy");
		if(!des.exists()) {
			des.mkdir();
		}
		copyMoreFile(src, des);

	}

	private static void copyMoreFile(File src, File des) throws Exception {
		if (src.isDirectory()) {
			File[] ff = src.listFiles();
			File t = new File(des, src.getName());
			if (ff == null) {
				t.mkdir();
				return;
			}
			t.mkdir();
			for (File file : ff) {
				copyMoreFile(file, t);
			}
		} else {
			File temFile = new File(des, src.getName());
			copy(src, temFile);
		}

	}

	private static void copy(File src, File temFile) throws Exception {
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(temFile));
		byte[] ch = new byte[1024];
		int l;
		while ((l = bufferedInputStream.read(ch)) != -1) {
			bufferedOutputStream.write(ch, 0, l);
		}
	}

}
