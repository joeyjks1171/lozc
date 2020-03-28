package com.ctl.lozc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LegendofzeldacraftTab extends CreativeTabs
{
   public LegendofzeldacraftTab(String label) { super("LegendofzeldacraftTab");
   this.setBackgroundImageName("lozc.png"); }
   public ItemStack getTabIconItem() { return new ItemStack(Item.getByNameOrId("lozc:master_sword")); }
}