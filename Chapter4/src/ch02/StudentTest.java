package ch02;

public class StudentTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1; 
		
		System.out.println(std1 == std2);		//false
		System.out.println(std1.equals(std2));	//false --> 재정의 후 true
		System.out.println(std3 == std1);		//true
		
		System.out.println(std1.hashCode()); //2054574951 --> 재정의 후 100
		System.out.println(std2.hashCode()); //1991294891 --> 재정의 후 100
		System.out.println(System.identityHashCode(std1)); //2054574951
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.hashCode()); // 96354
		System.out.println(str2.hashCode()); // 96354
		
		Integer i = 100;
		System.out.println(i.hashCode()); // 100
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent); //100,Kim
		System.out.println(System.identityHashCode(std1)); //2054574951
		System.out.println(System.identityHashCode(copyStudent)); //1991294891
		
	}

}
