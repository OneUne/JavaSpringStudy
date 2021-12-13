package ch16.playerbylevel;

public class PlayerTest {

	public static void main(String[] args) {
//		PlayerLevel bLevel = new BeginnerLevel();
		PlayerLevel aLevel = new AdvancedLevel();
		PlayerLevel sLevel = new SuperLevel();
		
		Player uni = new Player();
		uni.play();
		uni.upgradeLevel(aLevel);
		uni.play();
		uni.upgradeLevel(sLevel);
		uni.play();
	}

}
