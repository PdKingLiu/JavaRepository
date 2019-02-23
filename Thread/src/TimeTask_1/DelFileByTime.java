package TimeTask_1;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class Del extends TimerTask {

	@Override
	public void run() {
		File sre = new File("G:\\111");
		delFile(sre);
	}

	private void delFile(File sre) {
		File[] fileArr = sre.listFiles();
		if (fileArr != null) {
			for (File f : fileArr) {
				if (f.isDirectory())
					delFile(f);
				else {
					f.delete();
				}
			}
			sre.delete();
		}

	}
}

public class DelFileByTime {
	public static void main(String[] args) throws ParseException {
		
		Timer t =new Timer();
		String s = "2018-07-08 22:45:30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		t.schedule(new Del(), d);
	}
}
