package com.Javabook.Chapterfour;
class date {
	int year;
	int mouth;
	int day;
	public date() {}
	public date(int year,int mouth,int day) {
		this.year = year;
		this.mouth = mouth;
		this.day = day;
	}
	public void upupday() {
		int Day=this.day-2;
		System.out.println("前天是："+year+"年"+mouth+"月"+Day+"日");
	}
	public void upday() {
		int Day = day-1;
		System.out.println("昨天是："+year+"年"+mouth+"月"+Day+"日");
	}
	public void Tomorrow() {
		int Day = day+1;
		System.out.println("明天是："+year+"年"+mouth+"月"+Day+"日");
	}
	public void downdown() {
		int Day = day+2;
		System.out.println("明天是："+year+"年"+mouth+"月"+Day+"日");
	}
}
public class SectionTwo {

	public static void main(String[] args) {
		date da=new date(2017,5,20);
		da.upupday();
		da.upday();
		da.Tomorrow();
		da.downdown();
	}

}
