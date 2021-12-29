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
		
		Book book = new Book("데미안", "헤르만 헤세");
		
		System.out.println(book); // ch01.Book@7a765367 _ class full name@인스턴스가상메모리주소(JVM이 준 값)
		
		String str = new String("test");
		System.out.println(str); // new해서 얘도 인스턴스인데 test가 출력되는 이유는 toString()이 오버라이딩 되었기 때문.
	}

}
