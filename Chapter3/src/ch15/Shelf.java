package ch15;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>(); // 변수 선언에서 new 하는 것보다 생성자에서 new 하는 게 good.
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
