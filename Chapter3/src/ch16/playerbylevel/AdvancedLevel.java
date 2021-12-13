package ch16.playerbylevel;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Running fast");
	}

	@Override
	public void jump() {
		System.out.println("Jumping High");
	}
	
	@Override
	public void turn() {
		System.out.println("Lv.Advanced can't turn. Try to Level up!");
	}

	@Override
	public void showLevelMsg() {
		System.out.println("=============Lv.Advanced=============");
	}

}
