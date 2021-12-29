package ch04;

// �����̷� reflection programming�� �ϴ� �� object�� local�� �ƴ϶� remote�� ���� ��
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String");
		Class c1 = String.class;
		String s = new String();
		Class c2 = s.getClass();
		
		Constructor[] cons = c.getConstructors();
		
		for(Constructor co : cons) {
			System.out.println(co);
		}
		
		Method[] m = c.getMethods();
		for(Method mth : m) {
			System.out.println(mth);
		}
		
	}
}
