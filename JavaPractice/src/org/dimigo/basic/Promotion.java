package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		
		int m = 1700000;
		int c = 3;
		int s = 1500;
		
		System.out.println("<<��̺��� ���� �ΰ���>>");
		
		System.out.println("�� ��� �޿�:" + String.format("%,d��",m));
		
		System.out.println("���� �� ���� ��: " + c);
		
		System.out.println("���� ��:" + String.format("%,d��",s));
		
		System.out.println("���� �ΰǺ� : " + String.format("%,d��",(long)m * 12 * c * s));
		
//���� �ΰǺ� = �� ��� �޿� * 12 * ���� �� ���� �� * ���� ��       -> ���� �ΰǺ�: 91,800,000,000��
//õ���� �޸� ���     string.format("%d", 10000)->10,000
	}

}
