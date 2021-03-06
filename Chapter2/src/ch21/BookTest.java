package ch21;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5]; // 이렇게 한다고 책이 5개잡히는 것 X, 책 들어갈주소 메모리만 잡히는 것 O
		
		/*for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}*/
		// 이렇게만하면 null 5개 출력!
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(Book book : library) {
			System.out.println(book); //address
			book.showInfo();
		}
	}

}
