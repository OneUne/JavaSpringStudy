package ch19;

public class ForTest {

	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		
		for(int i=0; i<10; i++) {
		// ������ int count=1 �������� for(int i=0, count=1; �̷������ε� ����
		// count++�� �ؿ��� ���ϰ� ������ i++, count++ ���� ohoh
			sum += count;
		// ���� sum+= count++; �� ���� ohohoh
			count++;
		}
		
		System.out.println(sum);
	}
}
