package ch19;

public class Car {

	private static int curCarNum = 10001;
	private int carNum;
	
	public Car() {
		this.carNum = curCarNum++;
	}
	
	public int getCarNum() {
		return this.carNum; 
	}
}
