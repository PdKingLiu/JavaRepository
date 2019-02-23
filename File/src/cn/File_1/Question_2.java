package cn.File_1;

import java.io.File;

public class Question_2 {

	public static void main(String[] args) {
		File f = new File("F:\\Java\\Java ”∆µ");
		allFile(f);

	}

	private static void allFile(File f) {
		File[] ff = f.listFiles();
		
		for (File file : ff) {
			if (file.isDirectory()) {
				allFile(file);
			} else {
				String s = file.getName();
				if (s.endsWith(".avi")) {
					System.out.println(s);
				}
			}
		}

	}

}
