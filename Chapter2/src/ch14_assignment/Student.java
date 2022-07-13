package ch14_assignment;

public class Student {
	
	String studentName;
	int money;
	int payMoney; //고정급액이 아닌 택시에 지불할 금액
	
	public Student(String studentName, int money){
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}

	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은 "+money+"원 입니다."); 
	}
	
	//과제내용추가
	public void takeTaxi(Taxi taxi, int paymoney) {
		taxi.take(paymoney);
		this.money -= paymoney;
	}
}
