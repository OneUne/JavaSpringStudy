package ch03;

public class StringTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java)); // 815992954
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java)); // 868737467
	}
}
