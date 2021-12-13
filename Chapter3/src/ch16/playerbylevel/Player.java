package ch16.playerbylevel;

public class Player {
	
	private PlayerLevel level;
	private int count = 1;
	
//	public Player(PlayerLevel level) {
//		this.level = level;
//	}
	
	public Player(){
		level = new BeginnerLevel();
		level.showLevelMsg();
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		count += 1;
		level.showLevelMsg();
	}
	
	public void play() {
		//level.showLevelMsg();
		level.go(count);
	}
}
