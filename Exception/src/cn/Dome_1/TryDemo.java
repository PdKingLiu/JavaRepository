package cn.Dome_1;

public class TryDemo {

	public static void main(String[] args) {

		int a = 1;
		int b = 0;
		try { // ��try������뻹��ִ��
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("����Ϊ��");
		}
		System.out.println("aaa");
		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ��");
		}
		System.out.println("aaa");

		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println("����Ϊ��");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ��");
		} catch (Exception e) {
			System.out.println("��������");
		}
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("��������");
		}
	}

}
