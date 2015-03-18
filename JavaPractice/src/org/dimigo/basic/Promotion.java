package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		
		int m = 1700000;
		int c = 3;
		int s = 1500;
		
		System.out.println("<<디미베네 연간 인간비>>");
		
		System.out.println("월 평균 급여:" + String.format("%,d원",m));
		
		System.out.println("점포 내 직원 수: " + c);
		
		System.out.println("점포 수:" + String.format("%,d개",s));
		
		System.out.println("연간 인건비 : " + String.format("%,d원",(long)m * 12 * c * s));
		
//연간 인건비 = 월 평균 급여 * 12 * 점포 내 직원 수 * 점포 수       -> 연간 인건비: 91,800,000,000원
//천단위 콤마 찍기     string.format("%d", 10000)->10,000
	}

}
