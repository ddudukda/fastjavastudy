package ch14_assignment;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		studentJ.takeBus(bus100);
		
		Subway subwayGreen = new Subway("GREEN");
		studentT.takeSubway(subwayGreen);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		subwayGreen.showBusInfo();
		
		bus500.showBusInfo();
		
		System.out.println("\n");
		
		
		//과제내용추가
		Student studentE = new Student("Edward", 20000);
		Taxi taxi = new Taxi("잘 나간다 운수");
		studentE.takeTaxi(taxi,8500);
		
		studentE.showInfo();
		taxi.showTaxiInfo();
		
	}

}
