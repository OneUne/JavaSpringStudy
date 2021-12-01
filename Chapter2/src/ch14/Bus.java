package ch14;

public class Bus {
	int busNumber;
	int passangerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//Student.java에서 bus.take의 take를 ctrl누르고 클릭시 이리로 옴. 객체간협력^___^
	public void take(int money) {
		this.money += money;
		this.passangerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber+"번 버스의 승객 수는 "+passangerCount+"명 이고, 수입은 "+money+"원 입니다.");
	}
}
