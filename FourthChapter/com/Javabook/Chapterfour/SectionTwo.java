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
		System.out.println("ǰ���ǣ�"+year+"��"+mouth+"��"+Day+"��");
	}
	public void upday() {
		int Day = day-1;
		System.out.println("�����ǣ�"+year+"��"+mouth+"��"+Day+"��");
	}
	public void Tomorrow() {
		int Day = day+1;
		System.out.println("�����ǣ�"+year+"��"+mouth+"��"+Day+"��");
	}
	public void downdown() {
		int Day = day+2;
		System.out.println("�����ǣ�"+year+"��"+mouth+"��"+Day+"��");
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
