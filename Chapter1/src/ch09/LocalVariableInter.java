package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		var i = 10; // int
		var j = 10.0; //double
		var str = "test"; //str
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str; // ���� str ����. �°� str�̾����� �굵 str�̶� �߷�.
		System.out.println(str2);
		
		str = "hello";
		// str = 3; // cannot covert int to string 
		
	}

}
