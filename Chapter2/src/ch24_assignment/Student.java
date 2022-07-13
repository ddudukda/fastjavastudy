package ch24_assignment;

import java.util.ArrayList;

public class Student {

	private int studentNum;
	private String studentName;
	ArrayList<Subject> subjectList;

	public Student(int studentNum, String studentName) {
		
		this.studentNum = studentNum;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String subjectName, int subjectScore) {
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setSubjectScore(subjectScore);
		
		subjectList.add(subject);
	}
	
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject s : subjectList) {
			total += s.getSubjectScore();
			
			System.out.println("학생 " + studentName + "의 " + s.getSubjectName() + " 과목 성적은 " + s.getSubjectScore() + "점 입니다.");
			
		}
		
		System.out.println("학생 " + studentName + "의 총점은 " + total + "점 입니다.");
	}
}
