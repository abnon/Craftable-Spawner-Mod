package com.organicapple.craftablespawnermod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(new ItemStack(Items.ROTTEN_FLESH, 1), new ItemStack(Items.LEATHER), 1.0f);
	}
}
