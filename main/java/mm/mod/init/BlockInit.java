package mm.mod.init;

import java.util.ArrayList;
import java.util.List;

import mm.mod.objects.blocks.BlockBase;
import mm.mod.objects.blocks.BlockOres;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
}
