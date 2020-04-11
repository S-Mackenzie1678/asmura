package entities;

public abstract class Item {
	String name;
	String description;
		
	int itemID;
		
	int getItemID() {
		return itemID;
	}

	abstract void use(PlayerCharacter player);
	abstract void useInBattle(PlayerCharacter player, Opponent enemy);

	void pickUp(PlayerCharacter player) {
		player.inventory.add(this);	// This	will eventually be a thing when an instance of player is made in main.
	}
	
	void remove(PlayerCharacter player) {
		player.inventory.remove(this);
	}
}
