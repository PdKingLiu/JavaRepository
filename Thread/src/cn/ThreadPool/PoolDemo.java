package cn.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolDemo {
	public static void main(String[] args) {
		ExecutorService Pool = Executors.newFixedThreadPool(2);
		Pool.submit(new MyRunnable());
		Pool.submit(new MyRunnable());
		Pool.shutdown();
	}
}
