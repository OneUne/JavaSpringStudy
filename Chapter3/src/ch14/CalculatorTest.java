package ch14;

public class CalculatorTest {

	public static void main(String[] args) {


		 int num1 = 10; int num2 = 2;
		 
		 Calc calc = new CompleteCalc(); // 타입상속했으니까. 타입 Calc.
		 System.out.println(calc.add(num1, num2));
		 System.out.println(calc.substract(num1, num2));
		 System.out.println(calc.multiply(num1, num2));
		 System.out.println(calc.divide(num1, num2));
		 
		 calc.description();

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Calc.total(arr));
		
	}

}
