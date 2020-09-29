package codes.biscuit.skyblockaddons.features.dungeonLootTracker;

import codes.biscuit.skyblockaddons.core.ItemRarity;
import codes.biscuit.skyblockaddons.utils.ItemUtils;
import lombok.Getter;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.nbt.NBTTagList;

public enum DungeonLoot {
	/* ---> Flor 1 <--- */
	BONZO_STAFF("Bonzo's Staff", "BONZO_STAFF", ItemRarity.RARE, Items.blaze_rod),
	BONZO_MASK("Bonzo's Mask", "BONZO_MASK", ItemRarity.RARE, "e1dd9e27-97a7-49a8-8b99-6d2503607642", "fbf277d65a2b1aaa9b7c90f0e3a8b3e6b3f649e278d08fbcb9d249c880d73c27"),
	NECROMANCERS_BROOCH("Necromancer's Brooch", "NECROMANCER_BROOCH", ItemRarity.RARE, "ea3ee289-11c8-32b4-8913-c98703b1ab1c", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjViNmJlYWM1NzM2NWNhZjQ2ZjAzN2YzZDJhM2E0NTdmNmNhZmU2NDc1N2JhZjE0ZTg5OTNjZDJkYTE4Y2ZmNyJ9fX0K", true),
	RED_NOSE("Red Nose", "RED_NOSE", ItemRarity.RARE, "935f5d83-5c2c-34ce-8942-5a314efe9358", "ewogICJ0aW1lc3RhbXAiIDogMTU5MzYxMTA5MzQ5MSwKICAicHJvZmlsZUlkIiA6ICJlNzkzYjJjYTdhMmY0MTI2YTA5ODA5MmQ3Yzk5NDE3YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVfSG9zdGVyX01hbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82Yjc0OTBiNzY5YzkwYjI5YzRkMDgzNzE1YTc1MmEwNTU4NzhjYzE5NTQzNDUxYWMzODdmODhmNzQ5MzQ1OTA2IgogICAgfQogIH0KfQ", true),
	
	/* ---> Floor 2 <--- */
	ADAPTIVE_BLADE("Adaptive Blade", "ADAPTIVE_BLADE", ItemRarity.EPIC, Items.stone_sword, false),
	SCARF_STUDIES("Scarf's Studies", "SCARF_STUDIES", ItemRarity.RARE, "eb6966be-d293-35e9-9aa0-26d233d7e91d", "6de4ab129e137f9f4cbf7060318ee1748dc39da9b5d129a8da0e614e2337693"),
	RED_SCARF("Red Scarf", "RED_SCARF", ItemRarity.RARE, "534c842c-aa71-3acb-a45b-1e7579d44777", "9431a1efe33263fa00efdf479cf40a11c1316db323bc8d7873f8997e8e2f75d9"),
	
	/* ---> Floor 3 <--- */
	ADAPTIVE_HELMET("Adaptive Helm", "ADAPTIVE_HELMET", ItemRarity.EPIC, "1756e280-9a64-3027-9c50-553d59999221", "16f0d34aaa714377983701c1bbe9b3f6e7b30cb38571bc0a2fd7541d7edb1637"),
	ADAPTIVE_CHESTPLATE("Adaptive Chestplate", "ADAPTIVE_CHESTPLATE", ItemRarity.EPIC, Items.leather_chestplate, 0, false, 12565682),
	ADAPTIVE_LEGGINGS("Adaptive Leggings", "ADAPTIVE_LEGGINGS", ItemRarity.EPIC, Items.leather_leggings, 0 , false, 12565682),
	ADAPTIVE_BOOTS("Adaptive Boots", "ADAPTIVE_BOOTS", ItemRarity.EPIC, Items.leather_boots, 0, false, 12565682),
	
	/* ---> Floor 4 <--- */
	SPIRIT_BONE("Spirit Bone", "SPIRIT_BONE", ItemRarity.EPIC, "955daa6f-a6e0-3a10-94c4-070303323b37", "b8a79c512cff1a9f47319fd77efd06f673a772aa97597436b0160c409c8a2e60"),
	SPIRIT_BOW("Spirit Bow", "SPIRIT_BOW", ItemRarity.LEGENDARY, Items.bow),
	SPIRIT_BOOTS("Spirit Boots", "THORNS_BOOTS", ItemRarity.EPIC, Items.leather_boots, 0, false, 12566463),
	SPIRIT_WING("Spirit Wing", "SPIRIT_WING", ItemRarity.EPIC, "8b0c89f1-0b5e-3992-9686-1012e9a5941b", "ewogICJ0aW1lc3RhbXAiIDogMTU5NjAzODQyNTM5OSwKICAicHJvZmlsZUlkIiA6ICJjZGM5MzQ0NDAzODM0ZDdkYmRmOWUyMmVjZmM5MzBiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSYXdMb2JzdGVycyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMjlhZDc2YzI0NTk5MTFjMmJiYWNkY2QwYTdiODJlMDgzNTU2N2UzZTUxMzRiMDVhNmY1YWY2NjlkZDg4YjgzIgogICAgfQogIH0KfQ==", true),
	
	/* ---> Floor 5 <--- */
	ASSASSIN_HELMET("Assassin Helmet", "SHADOW_ASSASSIN_HELMET", ItemRarity.EPIC, "8c29f21d-0af3-324e-982b-dca5c7659bc4", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWI4YWY1MmVmMmY3MmMzYmY1ZWNlNmU3MGE4MmYxMzcxOTU5Y2UzZmNiNzM2YzUwMDMwNWNhZGRjNTA1YzVlMiJ9fX0", true),
	ASSASSIN_CHESTPLATE("Assassin Chestplate", "SHADOW_ASSASSIN_CHESTPLATE", ItemRarity.EPIC, Items.leather_chestplate, 0, false, 0x000000),
	ASSASSIN_LEGGINGS("Assassin Leggings", "SHADOW_ASSASSIN_LEGGINGS", ItemRarity.EPIC, Items.leather_leggings, 0, false, 0x000000),
	ASSASSIN_BOOTS("Assassin Boots", "SHADOW_ASSASSIN_BOOTS", ItemRarity.EPIC, Items.leather_boots, 0, false, 0x000000),
	LIVID_DAGGER("Livid Dagger", "LIVID_DAGGER", ItemRarity.LEGENDARY, Items.stone_sword),
	LAST_BREATH("Last Breath", "LAST_BREATH", ItemRarity.LEGENDARY, Items.bow),
	SHADOW_FURY("Shadow Fury", "SHADOW_FURY", ItemRarity.LEGENDARY, Items.diamond_sword),
	WARPED_STONE("Warped Stone", "AOTE_STONE", ItemRarity.RARE, "8fa8272c-7171-3ff6-a997-b46ed76a3bf7", "5cb7c21cc43dc17678ee6f16591ffaab1f637c37f4f6bbd8cea497451d76db6d"),
	
	/* ---> Every Floor <--- */
	RECOMBOBULATOR_3000("Recombobulator 3000", "RECOMBOBULATOR_3000", ItemRarity.LEGENDARY, "96538e7f-6b56-3557-9b7d-458afe4239e9", "57ccd36dc8f72adcb1f8c8e61ee82cd96ead140cf2a16a1366be9b5a8e3cc3fc"),
	FUMING_POTATO_BOOK("Fuming Potato Book", "FUMING_POTATO_BOOK", ItemRarity.EPIC, Items.book, true)
	;
	
	@Getter private String skyBlockID;
	@Getter private ItemRarity rarity;
	@Getter private ItemStack itemStack;
	@Getter private String name;
	
	DungeonLoot(String name, String skyBlockID, ItemRarity rarity, Item item) {
		this(name, skyBlockID, rarity, item, false);
	}
	DungeonLoot(String name, String skyBlockID, ItemRarity rarity, Item item, boolean enchanted) {
		this(name, skyBlockID, rarity, item, 0, enchanted);
	}
	DungeonLoot(String name, String skyBlockID, ItemRarity rarity, Item item, int meta, boolean enchanted) {
		this.itemStack = ItemUtils.createItemStack(item, meta, name, skyBlockID, enchanted);
		this.skyBlockID = skyBlockID;
		this.rarity = rarity;
		this.name = name;
	}
	DungeonLoot(String name, String skyBlockID, ItemRarity rarity, Item item, int meta, boolean enchanted, int color) {
		this.itemStack = ItemUtils.createItemStack(item, meta, name, skyBlockID, enchanted);
		this.skyBlockID = skyBlockID;
		this.rarity = rarity;
		this.name = name;
		
		NBTTagCompound nbt_color = new NBTTagCompound();
		nbt_color.setInteger("color", color);
		
		this.itemStack.setTagInfo("display", nbt_color);
	}
	
	DungeonLoot(String name, String skyBlockID, ItemRarity rarity, String skullID, String textureURL) {
		this.itemStack = ItemUtils.createSkullItemStack(name, skyBlockID, skullID, textureURL);
		this.skyBlockID = skyBlockID;
		this.rarity = rarity;
		this.name = name;
	}
	
	DungeonLoot(String name, String skyBlockID, ItemRarity rarity, String skullID, String textureURL, boolean withoutHash) {
		this.skyBlockID = skyBlockID;
		this.rarity = rarity;
		this.name = name;
		
		ItemStack stack = new ItemStack(Items.skull, 1, 3);
		
		NBTTagCompound texture = new NBTTagCompound();
		texture.setString("Value", textureURL);
		
		NBTTagList textures = new NBTTagList();
		textures.appendTag(texture);
		
		NBTTagCompound properties = new NBTTagCompound();
		properties.setTag("textures", textures);
		
		NBTTagCompound skullOwner = new NBTTagCompound();
		skullOwner.setTag("Properties", properties);
		
		skullOwner.setString("Id", skullID);
		
		stack.setTagInfo("SkullOwner", skullOwner);
		
		this.itemStack = stack;
	}
}
