package ch16.playerbylevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Running very fast");
	}

	@Override
	public void jump() {
		System.out.println("Jumping very high");
	}

	@Override
	public void turn() {
		System.out.println("Turning");
	}

	@Override
	public void showLevelMsg() {
		System.out.println("=============Lv.Super=============");
	}

}
