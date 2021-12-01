package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		var i = 10; // int
		var j = 10.0; //double
		var str = "test"; //str
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str; // 변수 str 대입. 걔가 str이었으니 얘도 str이라 추론.
		System.out.println(str2);
		
		str = "hello";
		// str = 3; // cannot covert int to string 
		
	}

}
