package ch19_assignment;

public class Car {

	public static int serialNum = 1000;	
	int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}

	public int getCarNum() {
		return carNum;
	}
	
	public void setCarNum(int carNum) {
		this.carNum = carNum;
		
	}
	
	public int getSerialNum() {
		return serialNum;
	}
	
	
	
}
