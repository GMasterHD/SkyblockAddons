package codes.biscuit.skyblockaddons.features.dungeonLootTracker;

import com.google.common.collect.Lists;
import lombok.Getter;

import java.util.List;

public enum DungeonFloor {
	F1("Bonzo", "f1", DungeonLoot.BONZO_MASK, DungeonLoot.BONZO_STAFF, DungeonLoot.RED_NOSE, DungeonLoot.NECROMANCERS_BROOCH,
			DungeonLoot.FUMING_POTATO_BOOK, DungeonLoot.RECOMBOBULATOR_3000),
	F2("Scarf", "f2", DungeonLoot.SCARF_STUDIES, DungeonLoot.RED_SCARF, DungeonLoot.ADAPTIVE_BLADE,
			DungeonLoot.FUMING_POTATO_BOOK, DungeonLoot.RECOMBOBULATOR_3000),
	F3("The Professor", "f3", DungeonLoot.ADAPTIVE_HELMET, DungeonLoot.ADAPTIVE_CHESTPLATE, DungeonLoot.ADAPTIVE_LEGGINGS, DungeonLoot.ADAPTIVE_BOOTS,
			DungeonLoot.FUMING_POTATO_BOOK, DungeonLoot.RECOMBOBULATOR_3000),
	F4("Thorn", "f4", DungeonLoot.SPIRIT_BONE, DungeonLoot.SPIRIT_BOW, DungeonLoot.SPIRIT_WING, DungeonLoot.SPIRIT_BOOTS,
			DungeonLoot.FUMING_POTATO_BOOK, DungeonLoot.RECOMBOBULATOR_3000),
	F5("Livid", "f5", DungeonLoot.ASSASSIN_HELMET, DungeonLoot.ASSASSIN_CHESTPLATE, DungeonLoot.ASSASSIN_LEGGINGS, DungeonLoot.ASSASSIN_BOOTS,
			DungeonLoot.LIVID_DAGGER, DungeonLoot.LAST_BREATH, DungeonLoot.SHADOW_FURY, DungeonLoot.WARPED_STONE, DungeonLoot.DARK_ORB,
			DungeonLoot.FUMING_POTATO_BOOK, DungeonLoot.RECOMBOBULATOR_3000),
	F6("Sadan", "f6", DungeonLoot.NECROMANCER_LORD_HELMET, DungeonLoot.NECROMANCER_LORD_CHESTPLATE, DungeonLoot.NECROMANCER_LORD_LEGGINGS, DungeonLoot.NECROMANCER_LORD_BOOTS,
			DungeonLoot.GIANT_SWORD, DungeonLoot.GIANT_TOOTH, DungeonLoot.PRECURSOR_EYE,
			DungeonLoot.FUMING_POTATO_BOOK, DungeonLoot.RECOMBOBULATOR_3000)
	;
	
	@Getter private String bossName;
	@Getter private String floorID;
	@Getter private List<DungeonLoot> dungeonLoot;
	
	DungeonFloor(String bossName, String floorID, DungeonLoot... dungeonLoot) {
		this.bossName = bossName;
		this.floorID = floorID;
		this.dungeonLoot = Lists.newArrayList(dungeonLoot);
	}
}
