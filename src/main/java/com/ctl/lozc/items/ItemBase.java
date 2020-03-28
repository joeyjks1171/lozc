package com.ctl.lozc.items;

import com.ctl.lozc.Main;
import com.ctl.lozc.init.ModItems;
import com.ctl.lozc.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
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