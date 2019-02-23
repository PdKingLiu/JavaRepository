package cn.Dome_1;

public class TryDemo {

	public static void main(String[] args) {

		int a = 1;
		int b = 0;
		try { // 用try后面代码还会执行
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("除数为零");
		}
		System.out.println("aaa");
		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界");
		}
		System.out.println("aaa");

		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println("除数为零");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界");
		} catch (Exception e) {
			System.out.println("出问题了");
		}
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("出问题了");
		}
	}

}
