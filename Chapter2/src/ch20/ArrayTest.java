package ch20;

public class ArrayTest {

	public static void main(String[] args) {
//		int[] arr = new int[10];
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		
		/*
		 * for(int i=0, num=1; i<arr.length; i++) { // System.out.println(arr[i]);
		 * arr[i] = num++; }
		 */
		
		//enhanced for��. ó������ ��(�迭ũ�⸸ŭ)���� �� ��ȸ�� ��.
		for(int num : arr) {
			total += num;
		}
		
		System.out.println(total);
	}

}
