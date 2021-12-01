package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {} // Constructor Overloading
	
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber; 
		// 멤버변수랑 지역변수 이름이 다르면 this. 안써도 되지만, 같은 게 보기 편하니까^^
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은" + studentNumber +"이고, " +grade+"학년 입니다.";
	}
}
