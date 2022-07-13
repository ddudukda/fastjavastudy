package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		/*
		 * Customer customerLee = new Customer(); customerLee.setCustomerName("이순신");
		 * customerLee.setCustomerID(10010);
		 */
		Customer customerLee = new Customer(10010, "이순신");
		
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
			
			
		/*
		 * VIPCustomer customerKim = new VIPCustomer();
		 * customerKim.setCustomerName("김유신"); customerKim.setCustomerID(10020);
		 */
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

	}

}
