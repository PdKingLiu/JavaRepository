package com.Javabook.ChapterThird;
import java.util.*;
public class SectionTwo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Nixu = sc.nextInt();
		int[] Wei = new int[20];
		int n = 0;
		while(Nixu!=0) {
			Wei[n++] = Nixu%10;
			Nixu=Nixu/10;
		}
		for(int i=0;i<n;i++) {
			System.out.print(Wei[i]);
		}
		sc.close();
	}
}