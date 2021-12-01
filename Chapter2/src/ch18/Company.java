//Singletone Pattern
package ch18;

public class Company {
	// 생성자 미제공시 컴파일러가 default 생성자(public)으로 자동 생성되므로 싱글톤에서는 private constructor 필요.
	private static Company instance = new Company();
	private Company() {}
	
	// 일반 메서드의 경우 instance 생성 후 메서드 호출할 수 있음.
	// so 여기서는 static(클래스)메서드로 작성해 클래스 이름으로 메서드 호출할 수 있게 함.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
