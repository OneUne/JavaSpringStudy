package ch16.playerbylevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Running slowly");
	}

	@Override
	public void jump() {
		System.out.println("Lv.Beginner can't jump. Try to Level up!");
	}

	@Override
	public void turn() {
		System.out.println("Lv.Beginner can't turn. Try to Level up!");
	}

	@Override
	public void showLevelMsg() {
		System.out.println("=============Lv.Beginner=============");
	}

}
