package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {
		
//		int[][] arr = {{1,2,3},{1,2,3,4}};
		int[][] arr = new int[3][4];
		int i,j;
		
		//arr.length하면 행의 길이(|), arr[i].length하면 열의 길이(ㅡ).
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + ",");
			}
			System.out.println("\t"+arr[i].length);
		}
	}

}
