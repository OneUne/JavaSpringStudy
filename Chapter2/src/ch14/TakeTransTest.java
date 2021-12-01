package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		studentJ.takeBus(bus100);
		
		Subway subway2 = new Subway(2);
		studentT.takeSubway(subway2);
		
		studentJ.showInfo();
		studentT.showInfo();
		bus100.showBusInfo();
		subway2.showSubwayInfo();
		bus500.showBusInfo();
	}

}
