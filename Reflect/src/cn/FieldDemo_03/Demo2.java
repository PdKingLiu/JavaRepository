package cn.FieldDemo_03;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo2 {
	public static void main(String[] args) throws Exception{
		ArrayList<Character> arr = new ArrayList<>();
		Class c = arr.getClass();
		Method m = c.getMethod("add", Object.class);
		m.invoke(arr, "1");
		m.invoke(arr, "2");
		m.invoke(arr, "3");
		System.out.println(arr);
	}
}
