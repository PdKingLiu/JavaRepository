package TimeTask_1;

import java.util.Timer;
import java.util.TimerTask;

public class ScheduleDeme {
	public static void main(String[] args) {
		Timer t = new Timer();
		//t.schedule(new MyTask(), 3000);
//		t.schedule(new MyTask(t), 3000);
		t.schedule(new MyTask(t), 1000,1000);
	}
}
class MyTask extends TimerTask{

	private Timer t;
	
	public MyTask() {
		super();
	}

	public MyTask(Timer t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		System.out.println("Ö´ÐÐÈÎÎñ");
//		t.cancel();
	}
	
}