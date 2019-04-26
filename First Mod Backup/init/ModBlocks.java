package com.organicapple.craftablespawnermod.init;

import java.util.ArrayList;
import java.util.List;

import com.organicapple.craftablespawnermod.blocks.BlockBase;
import com.organicapple.craftablespawnermod.blocks.MakeshiftSpawner;
import com.organicapple.craftablespawnermod.blocks.OpalOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block OPAL_ORE = new OpalOre("opal_ore", Material.GROUND);
	
	public static final Block MAKESHIFT_SPAWNER = new MakeshiftSpawner("makeshift_spawner", Material.IRON);
}
