package cn.File_1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo_2 {
	public static void main(String[] args) throws IOException {
		File f = new File("a.txt");
		// 判断
		System.out.println(f.createNewFile());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isHidden());
		// 获取
		System.out.println("----------------");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		System.out.println(f.getName());
		System.out.println(f.length());
		System.out.println(new Date(f.lastModified()));
		System.out.println("----------------");
		// 获取文件字符串数组
		File ff = new File("C:");
		String[] S = ff.list();
		for (String string : S) {
			System.out.println(string);
		}
		File[] fff = ff.listFiles();
		for (File file : fff) {
			System.out.println(file);
		}
	}
}
