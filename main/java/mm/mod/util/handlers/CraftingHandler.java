package mm.mod.util.handlers;

import mm.mod.init.BlockInit;
import mm.mod.init.ItemInit;
import mm.mod.util.Reference;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.ForgeRegistry;

public class CraftingHandler 
{
	public static void RegisterRecipes() {
		 ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>) ForgeRegistries.RECIPES;
		 {
			 //Smelting
			 GameRegistry.addSmelting(Item.getItemFromBlock(BlockInit.ORE_OVERWORLD), new ItemStack(ItemInit.INGOT_UN_PLATINUM), 6); 
			 
			 //Items
			 GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "shard_diamond"), new ResourceLocation(Reference.MODID + ":" + "shard_diamond"), new ItemStack(ItemInit.SHARD_DIAMOND), "D", 'D', Items.DIAMOND);
			 GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "ingot_platinum"), new ResourceLocation(Reference.MODID + ":" + "ingot_platinum"), new ItemStack(ItemInit.INGOT_PLATINUM), " S ", "SDS", " S ", 'D', ItemInit.INGOT_UN_PLATINUM, 'S', ItemInit.SHARD_DIAMOND);
			 
			 //Armour
			 GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "helmet_platinum"), new ResourceLocation(Reference.MODID + ":" + "helmet_platinum"), new ItemStack(ItemInit.HELMET_PLATINUM), "DDD", "D D", 'D', ItemInit.INGOT_PLATINUM);
			 GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "chestplate_platinum"), new ResourceLocation(Reference.MODID + ":" + "chestplate_platinum"), new ItemStack(ItemInit.CHESTPLATE_PLATINUM), "D D", "DDD", "DDD",'D', ItemInit.INGOT_PLATINUM);
			 GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "leggings_platinum"), new ResourceLocation(Reference.MODID + ":" + "leggings_platinum"), new ItemStack(ItemInit.LEGGINGS_PLATINUM), "DDD", "D D", "D D",'D', ItemInit.INGOT_PLATINUM);
			 GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "boots_platinum"), new ResourceLocation(Reference.MODID + ":" + "boots_platinum"), new ItemStack(ItemInit.BOOTS_PLATINUM), "D D", "D D",'D', ItemInit.INGOT_PLATINUM);
			 
			 //Tools
			 GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "axe_platinum"), new ResourceLocation(Reference.MODID + ":" + "axe_platinum"), new ItemStack(ItemInit.AXE_PLATINUM), "DD ", "DS ", " S ",'D', ItemInit.INGOT_PLATINUM, 'S', Items.STICK);
			 GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "hoe_platinum"), new ResourceLocation(Reference.MODID + ":" + "hoe_platinum"), new ItemStack(ItemInit.HOE_PLATINUM), "DD ", " S ", " S ",'D', ItemInit.INGOT_PLATINUM, 'S', Items.STICK);
			 GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "sword_platinum"), new ResourceLocation(Reference.MODID + ":" + "sword_platinum"), new ItemStack(ItemInit.SWORD_PLATINUM), " D ", " D ", " S ",'D', ItemInit.INGOT_PLATINUM, 'S', Items.STICK);
			 GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "pickaxe_platinum"), new ResourceLocation(Reference.MODID + ":" + "pickaxe_platinum"), new ItemStack(ItemInit.PICKAXE_PLATINUM), "DDD", " S ", " S ",'D', ItemInit.INGOT_PLATINUM, 'S', Items.STICK);
			 GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "shovel_platinum"), new ResourceLocation(Reference.MODID + ":" + "shovel_platinum"), new ItemStack(ItemInit.SHOVEL_PLATINUM), " D ", " S ", " S ",'D', ItemInit.INGOT_PLATINUM, 'S', Items.STICK);
		 }
	}
}
