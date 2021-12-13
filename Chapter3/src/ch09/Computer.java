package ch09;

public abstract class Computer {

	// 추상메서드가 있는 이유 : 현단계에서는 하위 단계가 어떻게 구현할지 모르기에 하위클래스에게 책임을 위임.
	// 암튼 뭘 구현해야하는지 알려주는 역할.
	public abstract void display();
	public abstract void typing();
	
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
