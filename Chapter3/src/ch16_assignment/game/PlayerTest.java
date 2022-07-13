package ch16_assignment.game;

public class PlayerTest {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel advanlevel = new AdvancedLevel();
		player.upgradeLevel(advanlevel);
		player.play(2);
		
		SuperLevel superlevel = new SuperLevel();
		player.upgradeLevel(superlevel);
		player.play(3);
		
	}

}
