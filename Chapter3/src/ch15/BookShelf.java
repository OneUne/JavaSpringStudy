package ch15;

// 메서드들은 보두 Queue의 것, shelf나 getCount 등 활용한 변수/메서드는 Shelf의 것.
public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
