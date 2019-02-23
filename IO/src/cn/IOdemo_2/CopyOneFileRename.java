package cn.IOdemo_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

public class CopyOneFileRename {
	public static void main(String[] args) throws IOException {
		File src = new File("G:\\ged");
		File des = new File("D:\\Copy");
		if (!des.exists()) {
			des.mkdir();
		}
		File[] ff = src.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		for (File file : ff) {
			StringBuffer bs = new StringBuffer();
			int dex = file.getName().lastIndexOf('.');
			bs.append(file.getName().substring(0, dex)).append(".jed");
			File newfile = new File(des, bs.toString());
			System.out.println(bs);
			copyfile(file, newfile);
		}
	}

	private static void copyfile(File file, File newfile) throws IOException {
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newfile));
		byte[] ch = new byte[1024];
		int l;
		while ((l = bufferedInputStream.read(ch)) != -1) {
			bufferedOutputStream.write(ch, 0, l);
		}
		bufferedInputStream.close();
		bufferedOutputStream.close();

	}
}