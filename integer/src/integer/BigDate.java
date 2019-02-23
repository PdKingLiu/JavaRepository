package integer;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;

public class BigDate {

	public static void main(String[] args) throws InterruptedException, ParseException {
		// BigInteger bigInteger = new BigInteger("1000");
		// BigInteger bigInteger2 = new BigInteger("50");
		// System.out.println(bigInteger.add(bigInteger2));
		// System.out.println(bigInteger.subtract(bigInteger2));
		// System.out.println(bigInteger.multiply(bigInteger2));
		// System.out.println(bigInteger.divide(bigInteger2));
		// BigInteger[] bigIntegers = bigInteger2.divideAndRemainder(bigInteger);
		// System.out.println(bigIntegers[0]);
		// System.out.println(bigIntegers[1]);
		// System.out.println(bigIntegers.length);
		// System.out.println(0.09 + 0.01);
		// System.out.println(1.09 + 0.0111);
		// System.out.println(1.015 * 100);
		// System.out.println("_________________________");

		// BigDecimal bigDecimal = new BigDecimal("0.09");
		// BigDecimal bigDecimal2 = new BigDecimal("0.01");
		// System.out.println(bigDecimal.add(bigDecimal2));

		// BigDecimal bigDecimal = new BigDecimal("1.015");
		// BigDecimal bigDecimal2 = new BigDecimal("100");
		// System.out.println(bigDecimal.multiply(bigDecimal2));
		// System.out.println(bigDecimal.divide(bigDecimal2, 9,
		// BigDecimal.ROUND_HALF_UP));
		// Date d = new Date();
		// long l = d.getTime();
		// Thread.sleep(300);
		// System.out.println(System.currentTimeMillis());
		// d.setTime(1000);
		// System.out.println(d);
		// System.out.println(l);

		// Date d = new Date();
		// SimpleDateFormat format = new SimpleDateFormat(); // 默认模式
		// SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		// //给定模式
		// String s = format.format(d);
		// System.out.println(s);
		// String sj = "2018年06月10日 14:20:53";
		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
		// d = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").parse(sj);
		// System.out.println(sj);

		// Scanner scanner = new Scanner(System.in);
		// System.out.print("出生年月日(如:2018-11-20):");
		// String bir = scanner.nextLine();
		// SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		// Date d = format.parse(bir);
		// System.out.println((System.currentTimeMillis() - d.getTime()) / 1000 / 60 /
		//  60 / 24);

		Calendar calendar = Calendar.getInstance();
		Scanner s = new Scanner(System.in);
//		int day = calendar.get(Calendar.YEAR);
//		System.out.println(day); 
		int y = s.nextInt();
		calendar.set(y, 2, 1);
//		System.out.println(calendar.get(Calendar.YEAR) + " " + (calendar.get(Calendar.MONTH) + 1) + " "
//				+ calendar.get(Calendar.DATE));
		calendar.add(Calendar.DATE, -1);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		

	}

}
