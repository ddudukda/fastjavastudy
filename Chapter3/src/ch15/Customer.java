package ch15;

public class Customer implements Buy,Sell{
	
	@Override
	public void buy() {
		System.out.println("Customer Buy");
	}

	@Override
	public void sell() {
		System.out.println("Customer Sell");
		
	}

	@Override
	public void order() {
		//Buy.super.order();
		System.out.println("Customer ORDER");
	}
	
	public void hello() {
		System.out.println("hello");
	}

}
