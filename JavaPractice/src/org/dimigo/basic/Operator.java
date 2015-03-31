package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a = 9, b = 10;
		double h1 = 5.8, h2 = 5.4;
		double sadari = (a+b)*h1*0.5;
		double punghang = h2 * a;
		
		System.out.println("<<도형 넓이의 비교>>");
		System.out.println("사다리꼴 넓이" + sadari); //55.1
		System.out.println("평행사변형의 넓이:" + punghang); //48.6
		System.out.println("사다리꼴이 평행사변형보다 " + (sadari-punghang) + " 크다."); //6.5더큼
	}

}
