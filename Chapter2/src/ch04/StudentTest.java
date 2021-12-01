package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); // 클래스 기반 인스턴스 생성
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); //패키지명@주소값(참조값) 반환
		System.out.println(studentKim); //ch04.Student@76b0bfab
		//실제 물리적인 주소는 아니고, JVM이 준 가상주소
	}

}
