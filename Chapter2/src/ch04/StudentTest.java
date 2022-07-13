package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentID = 123;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "제주도";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);

	}

}
