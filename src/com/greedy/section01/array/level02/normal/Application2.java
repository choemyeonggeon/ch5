package com.greedy.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ��� : ");
		String str = sc.nextLine();
		char ch[] = new char[str.length()];
		for(int i = 0; i < ch.length; i++){
			if(i > 7) {
			ch[i]= '*';
			}else {
				
				ch[i]= str.charAt(i); 
			}
		
			System.out.print(ch[i]);
			
		}
		
		
		
		
	}

/* �ֹε�Ϲ�ȣ�� ��ĳ�ʷ� �Է� �ް� ���� �迭�� ������ ��,
		 * ���� �ڸ� ���ĺ��� *�� ������ ����ϼ���
		 * 
		 * -- �Է� ���� --
		 * �ֹε�Ϲ�ȣ�� �Է��ϼ��� : 990101-1234567
		 * 
		 * -- ��� ���� --
		 * 990101-1******
		 */
		
	

}
