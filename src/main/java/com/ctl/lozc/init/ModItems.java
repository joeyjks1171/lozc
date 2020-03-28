package com.ctl.lozc.init;

import java.util.ArrayList;
import java.util.List;

import com.ctl.lozc.items.ItemBase;
import com.ctl.lozc.items.armor.ArmorBase;
import com.ctl.lozc.items.tools.ToolSword;
import com.ctl.lozc.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;


public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials Tools
	public static final ToolMaterial MATERIALS_MSWORDS = EnumHelper.addToolMaterial("material_msword", 0, 9000, 1, 6, 30);
	public static final ToolMaterial MATERIALS_KSWORDS = EnumHelper.addToolMaterial("material_ksword", 0, 9000, 1, 0, 30);
	public static final ToolMaterial MATERIALS_RSWORDS = EnumHelper.addToolMaterial("material_rsword", 0, 9000, 1, 1, 30);
	public static final ToolMaterial MATERIALS_GSWORDS = EnumHelper.addToolMaterial("material_gsword", 0, 9000, 1, 3, 30);
	public static final ToolMaterial MATERIALS_FSWORDS = EnumHelper.addToolMaterial("material_fsword", 0, 9000, 1, 4, 30);
	public static final ToolMaterial MATERIALS_BSWORDS = EnumHelper.addToolMaterial("material_bsword", 0, 9000, 1, 5, 30);
	
	//Material Armor
	public static final ArmorMaterial ARMOR_MATERIAL_HERO = EnumHelper.addArmorMaterial("armor_material_hero", Reference.MOD_ID + ":hero", 9000,
		new int	[] {2, 7, 5, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
	
	
	
	//Items
	public static final Item GREEN_RUPEE = new ItemBase("green_rupee");
	public static final Item BLUE_RUPEE = new ItemBase("blue_rupee");
	public static final Item RED_RUPEE = new ItemBase("red_rupee");
	public static final Item PURPLE_RUPEE = new ItemBase("purple_rupee");
	public static final Item HUGE_RUPEE = new ItemBase("huge_rupee");
	public static final Item ORANGE_RUPEE = new ItemBase("orange_rupee");
	
	//Swords
	public static final ItemSword MASTER_SWORD = new ToolSword("master_sword", MATERIALS_MSWORDS);
	public static final ItemSword KOKIRI_SWORD = new ToolSword("kokiri_sword", MATERIALS_KSWORDS);
	public static final ItemSword RAZOR_SWORD = new ToolSword("razor_sword", MATERIALS_RSWORDS);
	public static final ItemSword GILDED_SWORD = new ToolSword("gilded_sword", MATERIALS_GSWORDS);
	public static final ItemSword FAIRY_SWORD = new ToolSword("fairy_sword", MATERIALS_FSWORDS);
	public static final ItemSword BIGGORON_SWORD = new ToolSword("biggoron_sword", MATERIALS_BSWORDS);
	
	//Armor
    public static final Item HERO_HELMET = new  ArmorBase("hero_helmet", ARMOR_MATERIAL_HERO, 1, EntityEquipmentSlot.HEAD);
    public static final Item HERO_CHESTPLATE = new ArmorBase("hero_chestplate", ARMOR_MATERIAL_HERO, 1, EntityEquipmentSlot.CHEST);
    public static final Item HERO_LEGGINGS = new ArmorBase("hero_leggings", ARMOR_MATERIAL_HERO, 2, EntityEquipmentSlot.LEGS);
    public static final Item HERO_BOOTS = new ArmorBase("hero_boots", ARMOR_MATERIAL_HERO, 1, EntityEquipmentSlot.FEET);
	}
