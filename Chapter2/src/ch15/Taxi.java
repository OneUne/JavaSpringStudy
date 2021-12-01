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
		System.out.println(taxiCompany+"택시 수입은 "+revenue+"원 입니다.");
	}
}
