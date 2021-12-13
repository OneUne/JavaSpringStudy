package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer; // upcasting
		// Buy�� ��ĳ�������� ���� buy�� ����� buy, order�� ��� �����ϸ� �̴� customer���� �����ǵ� �޼��尡 ȣ���.
		// ����޼����� ���� ����. ���� Customer�� instance�̱� ������.
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
	}

}
