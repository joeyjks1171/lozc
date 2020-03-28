package com.ctl.lozc.items.armor;

import com.ctl.lozc.Main;
import com.ctl.lozc.init.ModItems;
import com.ctl.lozc.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorBase extends ItemArmor implements IHasModel {

	public ArmorBase(String name ,ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.LegendofzeldacraftTab);
		
		ModItems.ITEMS.add(this);

	}
@Override
public void registerModel()
{
	Main.proxy.registerItemRenderer(this, 0, "inventory ");
}

}
