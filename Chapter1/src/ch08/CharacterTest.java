package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);		
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		//char ch = -66; // 음수 사용 불가.
		//char ch = 1234567; // 2byte 내 핸들링 불가한 큰 숫자 사용 불가.
		
		char han = '한';
		char ch = '\uD55c';
		
		System.out.println(han);
		System.out.println(ch);		
	}

}
