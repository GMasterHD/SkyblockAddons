package codes.biscuit.skyblockaddons.features.dungeonLootTracker;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Floor {
	@Getter private int kills;
	@Getter private List<Loot> loot = new ArrayList<>();
	
	public void completed() {
		kills++;
	}
}
