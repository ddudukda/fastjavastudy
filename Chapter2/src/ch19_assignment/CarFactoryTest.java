package ch19_assignment;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		Car dreamCar = factory.createCar();
		
		System.out.println(mySonata.getCarNum());     //10001 출력
		System.out.println(yourSonata.getCarNum());   //10002 출력
		
		System.out.println(dreamCar.getCarNum());


	}

}
