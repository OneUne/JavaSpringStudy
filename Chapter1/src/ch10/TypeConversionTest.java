package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		byte bNum = 125;
		int iNum = bNum;
		
		System.out.println(iNum);
		
		iNum = 255;
		//bNum = iNum;
		bNum = (byte)iNum;
		
		double dNum = 3.14;
		//iNum = dNum;
		iNum = (int)dNum;
		System.out.println(iNum); // 3
		
		dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1); // 1
		System.out.println(iNum2); // 2 
	}

}
