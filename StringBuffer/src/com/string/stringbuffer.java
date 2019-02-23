package com.string;

public class stringbuffer {
	public static void main(String[] args) {
		// StringBuilder builder = new StringBuilder("ÎÚ¾¸¾¸");
		// System.out.println(builder.length());
		// System.out.println(builder.capacity());
		// builder.append("hello");
		// System.out.println(builder);
		// builder.append(123.5);
		// System.out.println(builder);
		// builder.insert(2, 123.6);
		// System.out.println(builder);
		// builder.deleteCharAt(2);
		// builder.deleteCharAt(2);
		// builder.deleteCharAt(2);
		// builder.deleteCharAt(2);
		// builder.deleteCharAt(2);
		// builder.deleteCharAt(2);
		// builder.delete(2, 7);
		// builder.delete(0, builder.length());
		// System.out.println(builder+"|");
		// builder.replace(2, 8, "ÁõÅæÅæ");
		// builder.delete(5, builder.length());
		// System.out.println(builder);
		// System.out.println(builder.reverse());
		// System.out.println(builder);
		// System.out.println(builder.reverse());
		// String s = builder.substring(2);
		// System.out.println(s);
		// System.out.println(builder);
		
		String s = "ÎÚ¾¸¾¸";
		StringBuilder b = new StringBuilder(s);
		System.out.println(b);
		b.append(s);
		System.out.println(b);
		
		String s2 = new String(b);
		System.out.println(s2);
		String s3 = b.toString();
		System.out.println(s3);
	}
}
