package ch14_assignment;

public class Subway {
	
	String lineColor;
	int passengerCount;
	int money;
	
	public Subway(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
	}
	
	public void showBusInfo() {
		System.out.println(lineColor+"라인의 승객수는 "+passengerCount+"명 이고, 수입은 "+money+"원 입니다.");
	}

}
