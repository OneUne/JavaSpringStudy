package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer; // upcasting
		// Buy로 업캐스팅했을 때는 buy에 선언된 buy, order만 사용 가능하며 이는 customer에서 재정의된 메서드가 호출됨.
		// 가상메서드의 원리 참고. 원래 Customer의 instance이기 때문임.
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
	}

}
