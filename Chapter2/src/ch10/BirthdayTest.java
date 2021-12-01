package ch10;

public class BirthdayTest {

	public static void main(String[] args) {
		Birthday date = new Birthday();
		
		date.setYear(2019);
		date.setMonth(12);
		//date.month=100 과 같이 하지 못하게 게터/세터가 있음으로써 멤버변수 또는 객체의 오용을 방지할 수 있음.
		//이런 코딩이 디버깅에도 유용. 사용하는 쪽에서 잘못하지 않도록 돕고, 메서드만 수정.
		date.setDay(30);
		
		date.showDate();
	}

}
