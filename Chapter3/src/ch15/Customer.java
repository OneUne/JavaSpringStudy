package ch15;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

	@Override
	public void order() {
		//Buy.super.order(); // 이러면 그냥 Buy의 order 쓰겠다는 뜻
		System.out.println("customer order");
	}
	
	public void hello() {
		System.out.println("Hello");
	}

}
