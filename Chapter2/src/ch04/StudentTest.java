package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); // Ŭ���� ��� �ν��Ͻ� ����
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "��⵵ ������";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); //��Ű����@�ּҰ�(������) ��ȯ
		System.out.println(studentKim); //ch04.Student@76b0bfab
		//���� �������� �ּҴ� �ƴϰ�, JVM�� �� �����ּ�
	}

}
