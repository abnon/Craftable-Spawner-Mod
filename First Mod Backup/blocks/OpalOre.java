package com.organicapple.craftablespawnermod.blocks;

import java.util.Random;

import com.organicapple.craftablespawnermod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class OpalOre extends BlockBase {
	
	public OpalOre(String name, Material material) {
		
		super(name, material);
		
		setSoundType(SoundType.STONE); // sound when walk over it
		setHardness(5.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 3); // needs diamond at least
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		return ModItems.OPAL;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		
		return 1;
	}
}
