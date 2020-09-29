package codes.biscuit.skyblockaddons.features.dungeonLootTracker;

import codes.biscuit.skyblockaddons.SkyblockAddons;
import codes.biscuit.skyblockaddons.utils.Utils;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumChatFormatting;

import java.util.*;
import java.util.regex.Pattern;

public class DungeonLootTracker {
	@Getter private Floor f1 = new Floor();
	@Getter private Floor f2 = new Floor();
	@Getter private Floor f3 = new Floor();
	@Getter private Floor f4 = new Floor();
	@Getter private Floor f5 = new Floor();
	
	@Getter private transient static DungeonLoot dungeonLootList[] = {
			DungeonLoot.BONZO_MASK,
			DungeonLoot.BONZO_STAFF,
			DungeonLoot.RED_NOSE,
			DungeonLoot.NECROMANCERS_BROOCH,
			
			DungeonLoot.RED_SCARF,
			DungeonLoot.SCARF_STUDIES,
			DungeonLoot.ADAPTIVE_BLADE,
			
			DungeonLoot.ADAPTIVE_HELMET,
			DungeonLoot.ADAPTIVE_CHESTPLATE,
			DungeonLoot.ADAPTIVE_LEGGINGS,
			DungeonLoot.ADAPTIVE_BOOTS,
			
			DungeonLoot.SPIRIT_BONE,
			DungeonLoot.SPIRIT_BOOTS,
			DungeonLoot.SPIRIT_BOW,
			DungeonLoot.SPIRIT_WING,
			
			DungeonLoot.ASSASSIN_BOOTS,
			DungeonLoot.ASSASSIN_LEGGINGS,
			DungeonLoot.ASSASSIN_CHESTPLATE,
			DungeonLoot.ASSASSIN_HELMET,
			DungeonLoot.LIVID_DAGGER,
			DungeonLoot.LAST_BREATH,
			DungeonLoot.SHADOW_FURY,
			DungeonLoot.WARPED_STONE,
			
			DungeonLoot.RECOMBOBULATOR_3000,
			DungeonLoot.FUMING_POTATO_BOOK
	};
	@Getter private transient static DungeonFloor dungeonFloorList[] = {
			DungeonFloor.F1,
			DungeonFloor.F2,
			DungeonFloor.F3,
			DungeonFloor.F4,
			DungeonFloor.F5
	};
	
	@Getter @Setter private int lastFloor = 0;
	
	@Getter private static DungeonLootTracker instance;
	
	public DungeonLootTracker() {
		instance = this;
	}
	
	public void addLoot(int dungeonRank, DungeonLoot item) {
		if(lastFloor == 0) {
			boolean found = false;
			for(int x = 0; x < f1.getLoot().size(); ++x) {
				if(f1.getLoot().get(x).getId().equalsIgnoreCase(item.getSkyBlockID())) {
					found = true;
					f1.getLoot().set(x, new Loot(item.getSkyBlockID(), 1 + f1.getLoot().get(x).getCount()));
				}
			}
			
			if(!found) {
				f1.getLoot().add(new Loot(item.getSkyBlockID()));
			}
		} else if(lastFloor == 1) {
			boolean found = false;
			for(int x = 0; x < f2.getLoot().size(); ++x) {
				if(f2.getLoot().get(x).getId().equalsIgnoreCase(item.getSkyBlockID())) {
					found = true;
					f2.getLoot().set(x, new Loot(item.getSkyBlockID(), 1 + f2.getLoot().get(x).getCount()));
				}
			}
			
			if(!found) {
				f2.getLoot().add(new Loot(item.getSkyBlockID()));
			}
		} else if(lastFloor == 2) {
			boolean found = false;
			for(int x = 0; x < f3.getLoot().size(); ++x) {
				if(f3.getLoot().get(x).getId().equalsIgnoreCase(item.getSkyBlockID())) {
					found = true;
					f3.getLoot().set(x, new Loot(item.getSkyBlockID(), 1 + f3.getLoot().get(x).getCount()));
				}
			}
			
			if(!found) {
				f3.getLoot().add(new Loot(item.getSkyBlockID()));
			}
		} else if(lastFloor == 3) {
			boolean found = false;
			for(int x = 0; x < f4.getLoot().size(); ++x) {
				if(f4.getLoot().get(x).getId().equalsIgnoreCase(item.getSkyBlockID())) {
					found = true;
					f4.getLoot().set(x, new Loot(item.getSkyBlockID(), 1 + f4.getLoot().get(x).getCount()));
				}
			}
			
			if(!found) {
				f4.getLoot().add(new Loot(item.getSkyBlockID()));
			}
		} else if(lastFloor == 4) {
			boolean found = false;
			for(int x = 0; x < f5.getLoot().size(); ++x) {
				if(f5.getLoot().get(x).getId().equalsIgnoreCase(item.getSkyBlockID())) {
					found = true;
					f5.getLoot().set(x, new Loot(item.getSkyBlockID(), 1 + f5.getLoot().get(x).getCount()));
				}
			}
			
			if(!found) {
				f5.getLoot().add(new Loot(item.getSkyBlockID()));
			}
		}
		
		SkyblockAddons.getInstance().getPersistentValuesManager().saveValues();
	}
}
