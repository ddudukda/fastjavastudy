package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(100001, "Tomas");
		Customer customerJ = new Customer(100002, "James");
		Customer customerK = new GoldCustomer(100003, "Kim");
		Customer customerB = new GoldCustomer(100004, "Bread");
		Customer customerA = new VIPCustomer(100005, "Alex");

		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerK);
		customerList.add(customerB);
		customerList.add(customerA);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 "+cost+"원을 지불했습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스포인트는 "+customer.bonusPoint+"원 입니다.");
		}

	}

}
