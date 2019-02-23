package cn.Dome_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TryDemo2 {
	public static void main(String[] args) {
		String s = "2018-07-05";
		Date d = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MaM-dd");
		try {
			d = sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		System.out.println(d);
	}
}
