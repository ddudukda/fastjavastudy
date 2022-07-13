package ch08_assignment;

public class OrderInfo {

	public String orderNumber;
	public String phoneNumber;
	public String adress;
	public String date;
	public String time;
	public String price;
	public String menuNumber;


	public String showOrderInfo() {
		return "주문 접수 번호 : "+orderNumber+"\n"
				+"주문 핸드폰 번호 : "+phoneNumber+"\n"
				+"주문 집 주소 : "+adress+"\n"
				+"주문 날짜 : "+date+"\n"
				+"주문 시간 : "+time+"\n"
				+"주문 가격 : "+price+"\n"
				+"메뉴 번호 : "+menuNumber;
	}
	
}
