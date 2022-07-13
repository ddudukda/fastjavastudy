package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("LEE");
		
		System.out.println(Employee.getSerialNum());
		
		System.out.println(employeeLee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("Kim");
		//employeeKim.serialNum++;
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId() + "번 입니다.");
		//System.out.println(employeeKim.serialNum);  //두개의 인스턴스가 하나의 메모리를 공유함을 알 수 있다.
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId() + "번 입니다.");

		
	}

}
