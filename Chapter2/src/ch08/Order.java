package ch08;

public class Order {
	// Date �� Calendar ��ü�� ����� �� �˸� �ð��̳� ��¥ ���� ���� �ش� ��ü�� ����ϸ� �˴ϴ�.
	// ���⼭ ���ڿ� �ش�Ǵ� �ڷ����� String���� ǥ���Ѱ� 0���� ���۵� ���ɼ��� �ִ� ���ڿ� �ش��մϴ�.
	String orderNum;
	String phoneNum;
	String address;
	String orderDate;
	String orderTime;
	String orderPrice;
	String menuNum;
	
	// �ű��� hot key : alt + shift + A 
	// add cursor�� add selection ��� �����
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
		System.out.println("�ֹ� ���� ��ȣ : "+orderNum);
		System.out.println("�ֹ� �ڵ��� ��ȣ : "+phoneNum);
		System.out.println("�ֹ� �� �ּ� : "+address);
		System.out.println("�ֹ� ��¥ : "+orderDate);
		System.out.println("�ֹ� �ð� : "+orderTime);
		System.out.println("�ֹ� ���� : "+orderPrice);
		System.out.println("�޴� ��ȣ : "+menuNum); 

	}
	
}
