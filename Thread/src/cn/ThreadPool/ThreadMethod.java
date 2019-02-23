package cn.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadMethod {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = executorService.submit(new MyCallable(100));
		Future<Integer> f2 = executorService.submit(new MyCallable(10));
		Integer i1 = f1.get();
		Integer i2 = f2.get();
		System.out.println(i1);
		System.out.println(i2);
	}

}
