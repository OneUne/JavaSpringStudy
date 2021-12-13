package ch06;

public class VIPCustomer extends Customer{
	

	// ����ϴ� Customer�� private �������� ����ϱ� ���� protected�� ������ ����.
	private int agentID;
	double saleRatio;
	
	/*
	public VIPCustomer() {
		//super(); // �� ���� Ŭ���� �⺻ �����ڰ� �ִ� ��쿡 ������� �ʾƵ� �����Ϸ��� ��������.
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
	
	
	// �̰͵� alt+shift+s �ϸ� override/implement�� method �ҷ��� �� ����.
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
