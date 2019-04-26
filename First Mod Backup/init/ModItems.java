package com.organicapple.craftablespawnermod.init;

import java.util.ArrayList;
import java.util.List;

import com.organicapple.craftablespawnermod.items.ItemBase;
import com.organicapple.craftablespawnermod.items.tools.ToolAxe;
import com.organicapple.craftablespawnermod.items.tools.ToolPickaxe;
import com.organicapple.craftablespawnermod.items.tools.ToolSpade;
import com.organicapple.craftablespawnermod.items.tools.ToolSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// materials
	public static final ToolMaterial MATERIAL_OPAL = EnumHelper.addToolMaterial("material_ruby", 3, 1561, 8.0F, 3.0F, 22);
	
	// items
	public static final Item WRENCH = new ItemBase("wrench");
	public static final Item OPAL = new ItemBase("opal");
	
	// tools
	public static final ItemSword OPAL_SWORD = new ToolSword("opal_sword", MATERIAL_OPAL);
	public static final ItemSpade OPAL_SPADE = new ToolSpade("opal_spade", MATERIAL_OPAL);
	public static final ItemPickaxe OPAL_PICKAXE = new ToolPickaxe("opal_pickaxe", MATERIAL_OPAL);
	public static final ItemAxe OPAL_AXE = new ToolAxe("opal_axe", MATERIAL_OPAL);
}
