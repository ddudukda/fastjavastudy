package ch10;

public abstract class Car {

	public void startCar() {
		System.out.println("운전을 시작합니다.");
	}
	
	public abstract void drive();
	
	public abstract void stop();
	
	public void turnOff() {
		System.out.println("차의 시동을 끕니다.");
	}
	
	public void wash() {}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		wash();
	}
	
}
