package ch06;

public class VIPCustomer extends Customer{
	

	// 상속하는 Customer의 private 변수들을 사용하기 위해 protected로 지정자 변경.
	private int agentID;
	double saleRatio;
	
	/*
	public VIPCustomer() {
		//super(); // 는 상위 클래스 기본 생성자가 있는 경우에 명시하지 않아도 컴파일러가 생성해줌.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() call");
	}
	*/

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	
	// 이것도 alt+shift+s 하면 override/implement할 method 불러올 수 있음.
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * saleRatio);
		return price;
	}

	public int getAgentID() {
		return agentID;
	}
	
}
