package ch15;

public class Taxi {

	String taxiCompany;
	int revenue;
	
	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;
	}
	
	public void take(int money) {
	revenue += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiCompany+"�ý� ������ "+revenue+"�� �Դϴ�.");
	}
}
