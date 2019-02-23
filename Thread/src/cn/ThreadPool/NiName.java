package cn.ThreadPool;

public class NiName {
	public static void main(String[] args) {
//		new Thread() {
//			@Override
//			public void run() {
//				for(int i=0;i<10;i++) {
//					System.out.println(Thread.currentThread().getName()+i);
//				}
//			}
//		}.start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName()+i);
				}
			}
		}) {
			@Override
			public void run() {
				for(int i=10;i<20;i++) {
					System.out.println(Thread.currentThread().getName()+i);
				}
			}
		}.start();
	}
}