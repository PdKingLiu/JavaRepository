package com.Javabook.Chapterfour;
class BeijingTime {
	int hour;
	int minute;
	int second;
	BeijingTime(){}
	BeijingTime(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public void print() {
		System.out.println("北京时间是："+hour+":"+minute+":"+second);
	}
}
public class Sectionthere {
	public static void main (String[] args) {
		BeijingTime time = new BeijingTime(13,20,50);
		time.print();
	}
}
