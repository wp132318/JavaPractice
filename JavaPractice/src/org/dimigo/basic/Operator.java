package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a = 9, b = 10;
		double h1 = 5.8, h2 = 5.4;
		double sadari = (a+b)*h1*0.5;
		double punghang = h2 * a;
		
		System.out.println("<<���� ������ ��>>");
		System.out.println("��ٸ��� ����" + sadari); //55.1
		System.out.println("����纯���� ����:" + punghang); //48.6
		System.out.println("��ٸ����� ����纯������ " + (sadari-punghang) + " ũ��."); //6.5��ŭ
	}

}
