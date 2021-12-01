package ch08;

public class Order {
	// Date 나 Calendar 객체를 사용할 줄 알면 시간이나 날짜 대한 값은 해당 객체를 사용하면 됩니다.
	// 여기서 숫자에 해당되는 자료형을 String으로 표현한건 0으로 시작될 가능성이 있는 숫자에 해당합니다.
	String orderNum;
	String phoneNum;
	String address;
	String orderDate;
	String orderTime;
	String orderPrice;
	String menuNum;
	
	// 신기한 hot key : alt + shift + A 
	// add cursor나 add selection 없어서 불편ㅠ
	public Order(String orderNum, String phoneNum, String address, String orderDate, String orderTime, String orderPrice, String menuNum) {
		this.orderNum = orderNum; 
		this.phoneNum = phoneNum; 
		this.address = address;   
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNum = menuNum;
	}
	
	public void showOrderInfo() {
		System.out.println("주문 접수 번호 : "+orderNum);
		System.out.println("주문 핸드폰 번호 : "+phoneNum);
		System.out.println("주문 집 주소 : "+address);
		System.out.println("주문 날짜 : "+orderDate);
		System.out.println("주문 시간 : "+orderTime);
		System.out.println("주문 가격 : "+orderPrice);
		System.out.println("메뉴 번호 : "+menuNum); 

	}
	
}
