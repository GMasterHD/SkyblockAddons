package codes.biscuit.skyblockaddons.features.dungeonLootTracker;

import lombok.Getter;

public class Loot {
	@Getter private String id;
	@Getter private int count;
	
	public Loot(String id) {
		this(id, 1);
	}
	public Loot(String id, int count) {
		this.id = id;
		this.count = count;
	}
	
	public void add() {
		this.count++;
	}
	public void set(int count) {
		this.count = count;
	}
}
