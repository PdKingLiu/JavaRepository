package jihe;

import java.util.Scanner;

public class EpOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter circle1s center x-, y-coordinates, and radius:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		System.out.println("Enter circle2s center x-, y-coordinates, and radius:");
		double a2 = input.nextDouble();
		double b2 = input.nextDouble();
		double c2 = input.nextDouble();
		double l = Math.sqrt((a2 - a) * (a2 - a) + (b2 - b) * (b2 - b));
		if(l>c-c2) {
			System.out.println("circle2 is inside circle1");
			return;
		}
		if(l<c+c2) {
			System.out.println("circle2 overlaps circle1");
			return;
		}
		if(l==c-c2||l==c+c2) 
		System.out.println("circle2 does not overlap circle1");
	}
}
