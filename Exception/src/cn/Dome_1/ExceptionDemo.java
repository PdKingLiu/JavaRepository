package cn.Dome_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {

}

class f {
	public void show() throws Exception {

	}

	public void method() {

	}
}

class z extends f {
	@Override
	public void show() throws Exception {
		super.show();
	}

	@Override
	public void method() {
		String s = "2018-07-05";
		Date d = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MaM-dd");
		try {
			d = sdf.parse(s);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}