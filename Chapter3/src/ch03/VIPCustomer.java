package ch03;

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
		System.out.println("VIPCustomer(int,String) call");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
