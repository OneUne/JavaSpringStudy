package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>(); //import hot key ctrl+shift+O
		
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));

		// ArrayList는 개수 지정안하면 일단 10개 생성함. 그리고 나중에 늘림.
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
		
	}

}
