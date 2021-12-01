package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		int gameScore = 150;
		int lastScore = ++gameScore; // gameScore +=1 하고 대입
		//int lastScore = gameScore++; // 대입 후 gameScore +=1
		System.out.println(lastScore);
		System.out.println(gameScore); 
		
	}

}
