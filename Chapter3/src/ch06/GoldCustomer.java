package ch06;

public class GoldCustomer extends Customer {

	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
	
		super(customerID, customerName);
		saleRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade = "GOLD";
	}
	
	//@Override 그냥 안 쓴 거임 쓰는 게 좋음.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int)(price * (1-saleRatio));
	}

}
