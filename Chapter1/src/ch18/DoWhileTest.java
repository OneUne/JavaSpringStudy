package ch18;

import java.util.Scanner;

public class DoWhileTest {
	// main �ƴϰ� Main �̶� �ߴ��� �ƿ� �� ���ư��� ����.. '-'
	// java�� ��Ģ- main �Լ����� ����. static�� ��� ��ü�� �����ϴ� ��. so ���� ��ü ����(for ȣ�� this) �ʿ����.
	// ���� : https://codingffler.tistory.com/16
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		/*
		input = scanner.nextInt();
		while(input != 0) {
			sum += input;
			input = scanner.nextInt();
		}
		*/
		
		do {
			input = scanner.nextInt();
			sum += input;
		}while(input !=0);
		
		System.out.println(sum);
	}
}
