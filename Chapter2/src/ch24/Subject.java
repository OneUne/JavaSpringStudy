package ch24;

public class Subject {
	
	// 강사님은 Student말고 Subject를 private으로 두고 getter and setter 생성함.
	String subjectName;
	int score;
	
	Subject(String subjectName, int score){
		this.subjectName = subjectName;
		this.score = score;
	}

}
