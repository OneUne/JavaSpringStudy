//Singletone Pattern
package ch18;

public class Company {
	// ������ �������� �����Ϸ��� default ������(public)���� �ڵ� �����ǹǷ� �̱��濡���� private constructor �ʿ�.
	private static Company instance = new Company();
	private Company() {}
	
	// �Ϲ� �޼����� ��� instance ���� �� �޼��� ȣ���� �� ����.
	// so ���⼭�� static(Ŭ����)�޼���� �ۼ��� Ŭ���� �̸����� �޼��� ȣ���� �� �ְ� ��.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
