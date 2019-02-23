package cn.Dome_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsDemo {

	public static void main(String[] args) throws ParseException {
		String s = "2018-07-05";
		Date d = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		d = sdf.parse(s);
		int a = 1;
		int b = 0;
		if (b == 0)
			throw new ArithmeticException();// 抛出类对象
		else
			System.out.println(a / b);
		System.out.println("aaa");
		System.out.println("aaa");
		//后面不执行
	}
	

}
