package ch09;

public abstract class Computer {

	// �߻�޼��尡 �ִ� ���� : ���ܰ迡���� ���� �ܰ谡 ��� �������� �𸣱⿡ ����Ŭ�������� å���� ����.
	// ��ư �� �����ؾ��ϴ��� �˷��ִ� ����.
	public abstract void display();
	public abstract void typing();
	
	void turnOn() {
		System.out.println("������ �մϴ�.");
	}

	void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
