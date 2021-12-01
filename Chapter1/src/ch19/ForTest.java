package ch19;

public class ForTest {

	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		
		for(int i=0; i<10; i++) {
		// 위에서 int count=1 안했으면 for(int i=0, count=1; 이런식으로도 가능
		// count++도 밑에서 안하고 위에서 i++, count++ 가능 ohoh
			sum += count;
		// 물론 sum+= count++; 도 가능 ohohoh
			count++;
		}
		
		System.out.println(sum);
	}
}
