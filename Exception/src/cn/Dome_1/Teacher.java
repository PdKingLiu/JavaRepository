package cn.Dome_1;

public class Teacher {
	public void check(int s) throws MyException {
		if (s > 100 || s < 0) {
			throw new MyException("分数异常");
		} else
			System.out.println("没有问题");
	}
}
