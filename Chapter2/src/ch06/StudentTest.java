package ch06;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		System.out.println(studentLee.showStudentInfo());
		// null�л��� �й���0�̰�, 0�г� �Դϴ�. --> ������� �ڵ� �ʱ�ȭ. ��ü(String)�� null�� int�� 0����.
		// ���������� �ڵ� �ʱ�ȭ �ȵƾ���.
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}

}
