package com.greedy.section01.array.level02.normal;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �ϳ� �Է��ϼ���");
		String str = sc.nextLine();
		
		int sum = 0;
		
		char[] a = new char[str.length()];
		for(int j= 0; j<a.length; j++) {
			a[j] = str.charAt(j);
		}
			System.out.println("���ڸ� �Է��ϼ���");
			char ch = sc.nextLine().charAt(0);
			for(int p =0; p<a.length; p++) {
				if(a[p]==ch) sum++;
			}
		
				
		
				System.out.println("�Է��Ͻ� ���ڿ�"+ str + "���� ã���ô� ����"+ch+"��" + sum +"���Դϴ�." );
				
			
			
	
		
		
		/* ���ڿ��� �ϳ� �Է¹޾� ���� �ڷ��� �迭�� �ٲ� ��
		 * �˻��� ���ڸ� �ϳ� �Է� �޾� 
		 * �Է� ���� �˻��� ���ڰ� ���ڿ��� � �ִ����� ����ϼ���
		 * 
		 * -- �Է� ���� --
		 * ���ڿ��� �ϳ� �Է��ϼ��� : helloworld
		 * �˻��� ���ڸ� �Է��ϼ��� : l
		 * 
		 * -- ��� ���� --
		 * �Է��Ͻ� ���ڿ� helloworld���� ã���ô� ���� l�� 3�� �Դϴ�.
		 * */
		
}

}
