package com.hello;

public class string {

	public static void main(String[] args) {
		// String s1 = new String();
		// byte[] bys = { 65, 66, 67, 68, 69 };
		// String s2 = new String(bys, 2, 3);
		// System.out.println(s2);
		// char[] cs = { '1', '2', '3', '4', '5' };
		// String s3 = new String(cs);
		// System.out.println(s3);
		// String s4 = new String(cs, 1, 1);
		// System.out.println(s4);
		// String s5 = new String("Abcd");
		// System.out.println(s5);
		// String s6 = "aBcD";
		// System.out.println(s6.equals(s5));
		// System.out.println(s6.equalsIgnoreCase(s5));
		// System.out.println(s5.contains("d"));
		// System.out.println(s5.startsWith("A"));
		// System.out.println(s5.startsWith("a"));
		// System.out.println(s5.startsWith("Ab"));
		// System.out.println(s6.endsWith("aBcD"));
		// System.out.println(s6.endsWith("cD"));
		// System.out.println(s6.endsWith("d"));
		// String s7 = "";
		// System.out.println(s7.isEmpty());
		// String s = "ab1A132AOIJ";
		// System.out.println(s.length());
		// System.out.println(s.charAt(4));
		// System.out.println(s.indexOf(50));
		// System.out.println(s.indexOf('2'));
		// System.out.println(s.indexOf('A'));
		// System.out.println(s.indexOf('A',7));
		// System.out.println(s.indexOf("2A"));
		// System.out.println(s.indexOf("2A",7));
		// System.out.println(s.substring(8));
		// System.out.println(s.substring(8, 10));

		String s = "asD";
		String s2 ="asd";
		byte[] b = s.getBytes();
		System.out.println(new String(b));
		char[] c = s.toCharArray();
		System.out.println(c);
		String s1 = String.valueOf(c);
		System.out.println(s1);
		int a = 1654654;
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(a) + "ADAS".toLowerCase());
		System.out.println(String.valueOf(a) + "Aasd".toUpperCase());
		System.out.println("Œ⁄æ∏æ∏".concat("¡ı≈Ê≈Ê"));
		s.replace('ÈŸ', '∂˘');
		System.out.println(s.replace('ÈŸ', '∂˘'));
		System.out.println(s.replace("ÈŸ◊”", "∞÷∞÷‡”‡”‡”"));
		s.trim();
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.compareToIgnoreCase(s2));
	}

}
