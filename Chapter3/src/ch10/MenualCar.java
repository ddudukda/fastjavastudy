package ch10;

public class MenualCar extends Car{

	@Override
	public void drive() {
		System.out.println("차를 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("차를 멈춥니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("운전자가 차의 시동을 끕니다.");
	}
	
	@Override
	public void wash() {
		System.out.println("세차를 합니다.");
	}
	

}
