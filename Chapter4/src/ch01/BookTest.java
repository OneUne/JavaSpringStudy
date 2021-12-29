package ch01;

class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return title + "," + author;
	}
}

public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("���̾�", "�츣�� �켼");
		
		System.out.println(book); // ch01.Book@7a765367 _ class full name@�ν��Ͻ�����޸��ּ�(JVM�� �� ��)
		
		String str = new String("test");
		System.out.println(str); // new�ؼ� �굵 �ν��Ͻ��ε� test�� ��µǴ� ������ toString()�� �������̵� �Ǿ��� ����.
	}

}
