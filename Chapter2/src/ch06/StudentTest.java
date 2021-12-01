package ch06;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		System.out.println(studentLee.showStudentInfo());
		// null학생의 학번은0이고, 0학년 입니다. --> 멤버변수 자동 초기화. 객체(String)은 null로 int는 0으로.
		// 지역변수는 자동 초기화 안됐었죠.
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}

}
