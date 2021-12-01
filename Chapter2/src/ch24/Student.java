package ch24;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String studentName;
	ArrayList<Subject> subjectList = new ArrayList<>();
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void addSubject(String subjectName, int score) {
//		Subject subject = new Subject();
//		subject.setName(name);
//		subject.setScorePoint(score);
//		subjectList.add(subject);
		subjectList.add(new Subject(subjectName, score));
	}
	
	public void showStudentInfo() {
		int total = 0;
		
//		for(Subject s : subjectList){
//			total += s.getScorePoint();
//			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + 
//			        s.getScorePoint() + "입니다.");
//		}

		for(int i=0; i<subjectList.size(); i++) {
			System.out.println("학생 "+studentName+"의 "+subjectList.get(i).subjectName+" 과목 성적은 "
								+subjectList.get(i).score+"점 입니다.");
			total += subjectList.get(i).score;
			//subjectArr[i] 아니고 subjectArr.get(i)
		}
		System.out.println("학생 "+studentName+"의 총점은 "+total+"점 입니다.");
		
	}
}
