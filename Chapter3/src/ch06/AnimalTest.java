package ch06;

import java.util.ArrayList;

// java 파일 하나에 클래스 하나를 주로 하는데, 여러 개도 가능, 암튼 public class는 하나여야 함.

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
/*
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
*/	
		ArrayList<Animal> animalList = new ArrayList<>(); //ctrl+shift+O로 import java.util.ArrayList;
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move(); // 얘도 다형성
		}
		
	}

	public void moveAnimal(Animal animal) {
		animal.move(); // 여기가 다형성. 코드 한 줄이지만, instance형에 따라 move의 implementation이 달라짐.
		// 다형성 구현 원리 : 상속(인터페이스로도 됨), 오버라이딩, 업캐스팅
		// --> 상속 시 하위클래스들을 상위클래스 하나의 타입으로 모두 핸들링 가능 = 결합도 타이트해짐.
		// 그러나 여기서 readBook, hunting, flying 이런 건 안됨. 다운캐스팅해야함.
	}
	
}
