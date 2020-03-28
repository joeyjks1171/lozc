package com.ctl.lozc.items.tools;

import com.ctl.lozc.Main;
import com.ctl.lozc.init.ModItems;
import com.ctl.lozc.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
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

