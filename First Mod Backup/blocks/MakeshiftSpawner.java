package com.organicapple.craftablespawnermod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MakeshiftSpawner extends BlockBase {

	public MakeshiftSpawner(String name, Material material) {
		
		super(name, material);
		
		setSoundType(SoundType.METAL); // sound it makes when you walk over it
		setHardness(5.0F);
		setResistance(17.5F);
		setHarvestLevel("pickaxe", 1); // needs iron at least
	}
}
