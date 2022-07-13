package ch10;

public class CarTest {

	public static void main(String[] args) {

		Car aicar = new AICar();
		System.out.println("=====AICAR=====");
		aicar.run();
		
		Car menualcar = new MenualCar();
		System.out.println("=====MenualCar=====");
		menualcar.run();
		
	}
	

}
