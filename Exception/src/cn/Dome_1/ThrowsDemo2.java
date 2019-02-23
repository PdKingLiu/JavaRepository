package cn.Dome_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsDemo2 {

	public static void main(String[] args) throws ParseException {
		String s = "2018-07-05";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-aMM-dd");
		Date d = new Date();
		try {
			d = dateFormat.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			System.out.println("这里还会执行");
		}
		System.out.println("这里也会执行");

		// try {
		// d= dateFormat.parse(s);
		// } catch (ParseException e) {
		// e.printStackTrace();
		// System.exit(0);
		// }finally {
		// System.out.println("这样就不会执行了");
		// }
		// System.out.println("这里也不会执行了");


	}

}
