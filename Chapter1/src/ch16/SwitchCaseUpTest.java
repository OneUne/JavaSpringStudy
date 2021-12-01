package ch16;

public class SwitchCaseUpTest {

	public static void main(String[] args) {
		
		int month = 4;
		
		int day = switch (month) {
	    	case 1, 3, 5, 7, 8, 10,12 -> {
	    		System.out.println("한 달은 31일입니다."); 
	    		yield 31;
	    	}
	    	// 수행하는 부분 따로 없으면 yield 도 안 써도 됨.
	    	case 4,6,9,11 -> 
	    		30;
	    	case 2 ->{
	    		System.out.println("한 달은 28일입니다.");
	    		yield 28;
	    	}
	    	default->{
	    		System.out.println("존재하지 않는 달 입니다."); 
	    		yield 0;
	    	}
		}; // day=의 마지막 세미콜론.
		System.out.println(month + "월은 " + day + "일입니다.");
	}
}
