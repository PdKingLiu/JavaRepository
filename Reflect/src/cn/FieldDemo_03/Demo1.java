package cn.FieldDemo_03;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		FileReader fileReader = new FileReader("a.txt");
		prop.load(fileReader);
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");
		Class c = Class.forName(className);
		Constructor cc = c.getConstructor();
		Object obj = cc.newInstance();
		Method method = c.getDeclaredMethod(methodName);
		method.setAccessible(true);
		method.invoke(obj);
		
	}
}