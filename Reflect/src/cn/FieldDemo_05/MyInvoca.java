package cn.FieldDemo_05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvoca implements InvocationHandler {
	private Object target;

	public MyInvoca(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("权限");
		Object obj = method.invoke(target, args);
		System.out.println("日志");
		return obj;
		
	}

}
