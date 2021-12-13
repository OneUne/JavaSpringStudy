package ch02;

public class VIPCustomer extends Customer{
	
	// 상속하는 Customer의 private 변수들을 사용하기 위해 protected로 지정자 변경.
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
