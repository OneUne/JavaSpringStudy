 package ch15;

public class IfElseIfTest {

	public static void main(String[] args) {
		int age = 12;
		int charge;
		
		if(age < 8){
			charge = 1000; 
			System.out.println("미 취학 아동입니다.");
		}
		else if(age < 14){
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if(age < 20){
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		}
		else{
			charge = 3000; // 초기화 안 해줬기 때문에 else로 default 해야 오류 안 남.
			System.out.println("일반인 입니다.");
		} 
		
		System.out.println("입장료는 " + charge + "원입니다.");
	}
}
