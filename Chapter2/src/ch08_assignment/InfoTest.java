package ch08_assignment;

public class InfoTest {

	public static void main(String[] args) {

		UserInfo user = new UserInfo("Tomas",37,"남성",180,78);
		System.out.println(user.showUserInfo());
		
		OrderInfo order = new OrderInfo();
		order.orderNumber = "202011020003";
		order.phoneNumber = "01023450001";
		order.adress="서울시 강남구 역삼동 111-333";
		order.date="20201102";
		order.time="130258";
		order.price="35000";
		order.menuNumber="0003";
		System.out.println(order.showOrderInfo());

	}

}
