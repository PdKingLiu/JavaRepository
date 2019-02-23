package integer;

public class inte {
	public static void main(String[] args) {
		System.out.println(Integer.toHexString(1000));
		System.out.println(Integer.toBinaryString(1000));
		System.out.println(Integer.toOctalString(1000));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		String s = "132";
		Integer i = new Integer(s);
		System.out.println(s);
		int a = Integer.parseInt("6541");
		System.out.println(a);
		System.out.println(Integer.toString(123456, 20));
		System.out.println(Integer.parseInt("64165", 7));
		Integer e = 100;
		e += 123;
		System.out.println(e);
		System.out.println(Character.isLowerCase('a'));
	}
}
