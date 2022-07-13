package ch10;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("AICar Drive: 자율주행합니다.");
		System.out.println("자동차가 스스로 방행을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("AICar Stop: 자동차가 스스로 멈춥니다.");
	}

}
