package com.greedy.section01.array.level01.basic;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String str[] ={"����", "�ٳ���", "������", "Ű��", "���"}; 
		System.out.println("�ش� ������ �ε����� �ִ� ������ ����ϼ���");
		int num = sc.nextInt();
	
	
		
		if(num>4) {
			System.out.println("�ٽ� �Է��ϼ���");
		}for (int i = 0; i < str.length; i++) {
			if(num == i) { 
				System.out.println(str[i]);
			}
		}
			
		}
		}
		

		
				
		
					
				
			
		
		
		
		/* ���̰� 5�� String �迭�� �����ϰ� 
		 * "����", "�ٳ���", "������", "Ű��", "���" �� �ʱ�ȭ�� �ϰ�
		 * ��ĳ�ʷ� 0���� 4������ ������ �Է� �޾�
		 * �ش� ������ �ε����� �ִ� ������ ����ϼ���
		 * 
		 * ��, �迭�� �ε��� ������ ����� ��� "�غ�� ������ �����ϴ�." �� ����ϼ���
		 * 
		 * -- �Է� ���� --
		 * 0���� 4������ ������ �Է��ϼ��� : 2
		 * 
		 * -- ��� ���� --
		 * ������
		 * 
		 * -- �Է� ���� --
		 * 0���� 4������ ������ �Է��ϼ��� : 5
		 * 
		 * -- ��� ���� --
		 * �غ�� ������ �����ϴ�.
		 * */
		
		


