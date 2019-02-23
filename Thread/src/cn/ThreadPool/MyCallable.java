package cn.ThreadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
	int sum=0;
	int q;
	public MyCallable(int q) {
		this.q = q;
	}

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i < q; i++) {
			sum+=i;
		}
		return sum;
	}

}
