package ch18;

import java.util.Scanner;

public class DoWhileTest {
	// main 아니고 Main 이라 했더니 아예 안 돌아가는 구만.. '-'
	// java의 규칙- main 함수부터 시작. static은 모든 객체가 공유하는 것. so 따로 객체 생성(for 호출 this) 필요없음.
	// 참고 : https://codingffler.tistory.com/16
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
