package ch10;

public class BirthdayTest {

	public static void main(String[] args) {
		Birthday date = new Birthday();
		
		date.setYear(2019);
		date.setMonth(12);
		//date.month=100 �� ���� ���� ���ϰ� ����/���Ͱ� �������ν� ������� �Ǵ� ��ü�� ������ ������ �� ����.
		//�̷� �ڵ��� ����뿡�� ����. ����ϴ� �ʿ��� �߸����� �ʵ��� ����, �޼��常 ����.
		date.setDay(30);
		
		date.showDate();
	}

}
