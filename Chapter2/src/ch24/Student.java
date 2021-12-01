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
//			System.out.println("�л� " + studentName + "�� " + s.getName() + " ���� ������ " + 
//			        s.getScorePoint() + "�Դϴ�.");
//		}

		for(int i=0; i<subjectList.size(); i++) {
			System.out.println("�л� "+studentName+"�� "+subjectList.get(i).subjectName+" ���� ������ "
								+subjectList.get(i).score+"�� �Դϴ�.");
			total += subjectList.get(i).score;
			//subjectArr[i] �ƴϰ� subjectArr.get(i)
		}
		System.out.println("�л� "+studentName+"�� ������ "+total+"�� �Դϴ�.");
		
	}
}
