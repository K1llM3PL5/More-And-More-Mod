package mm.mod.init;

import java.util.ArrayList;
import java.util.List;

import mm.mod.objects.armour.ArmourBase;
import mm.mod.objects.items.ItemBase;
import mm.mod.objects.tools.ToolAxe;
import mm.mod.objects.tools.ToolHoe;
import mm.mod.objects.tools.ToolPickaxe;
import mm.mod.objects.tools.ToolShovel;
import mm.mod.objects.tools.ToolSword;
import mm.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Armour Material
	public static final ArmorMaterial ARMOUR_PLATINUM  = EnumHelper.addArmorMaterial("armour_platinum", Reference.MODID + ":platinum", 24, new int[]{5, 8, 11, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.5F);
	
	//Tool Material
	public static final ToolMaterial TOOL_PLATINUM  = EnumHelper.addToolMaterial("tool_platinum", 4, 700, 10.0F, 4.2F, 15);
	
	//Items
	public static final Item INGOT_UN_PLATINUM = new ItemBase("ingot_un_platinum");
	public static final Item SHARD_DIAMOND = new ItemBase("shard_diamond");
	public static final Item INGOT_PLATINUM = new ItemBase("ingot_platinum");
	
	//Tools
	public static final Item AXE_PLATINUM = new ToolAxe("axe_platinum", TOOL_PLATINUM);
	public static final Item HOE_PLATINUM = new ToolHoe("hoe_platinum", TOOL_PLATINUM);
	public static final Item PICKAXE_PLATINUM = new ToolPickaxe("pickaxe_platinum", TOOL_PLATINUM);
	public static final Item SWORD_PLATINUM = new ToolSword("sword_platinum", TOOL_PLATINUM);
	public static final Item SHOVEL_PLATINUM = new ToolShovel("shovel_platinum", TOOL_PLATINUM);
	
	//Armour
	public static final Item HELMET_PLATINUM = new ArmourBase("helmet_platinum", ARMOUR_PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_PLATINUM = new ArmourBase("chestplate_platinum", ARMOUR_PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_PLATINUM = new ArmourBase("leggings_platinum", ARMOUR_PLATINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_PLATINUM = new ArmourBase("boots_platinum", ARMOUR_PLATINUM, 1, EntityEquipmentSlot.FEET);
	
}
