package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {
		Person edward = new Person("Edward", 20000);
		Taxi wellgoing = new Taxi("잘나간다 운수");
		
		edward.takeTaxi(wellgoing,10000);
		edward.showInfo();
		wellgoing.showTaxiInfo();
	}

}
