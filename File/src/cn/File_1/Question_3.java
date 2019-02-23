package cn.File_1;

import java.io.File;

public class Question_3 {
	//删除所有文件
	public static void main(String[] args) {
		File f = new File("D:\\123123");
		allFile(f);

	}

	private static void allFile(File f) {
		File[] ff = f.listFiles();
		
		for (File file : ff) {
			if (file.isDirectory()) {
				allFile(file);
			} else {
				System.out.println(file.getName()+"_______"+file.delete());
			}
		}
		System.out.println(f.getName()+"_______"+f.delete());

	}
}
