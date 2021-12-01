package ch15;

public class Person {

	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void takeTaxi(Taxi taxi, int money) {
		taxi.take(money);
		this.money -= money;
	}
	
	public void showInfo() {
		System.out.println(name+"´ÔÀÇ ÀÜ¾×Àº "+money+"¿ø ÀÔ´Ï´Ù.");
	}
}
