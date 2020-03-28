package com.ctl.lozc;

import com.ctl.lozc.handlers.RegistryHandler;
import com.ctl.lozc.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	public static final SimpleNetworkWrapper PACKET_HANDLER = NetworkRegistry.INSTANCE.newSimpleChannel("lozc:a");
	@SidedProxy(clientSide = "com.ctl.lozc.ClientProxyLozc", serverSide = "com.ctl.lozc.ServerProxyLozc")
	public Elements elements = new Elements();
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
		GameRegistry.registerWorldGenerator(elements, 5);
		GameRegistry.registerFuelHandler(elements);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new Elements.GuiHandler());
		elements.preInit(event);
		MinecraftForge.EVENT_BUS.register(elements);
		elements.getElements().forEach(element -> element.preInit(event));
		proxy.preInit(event);
	}
	public static final CreativeTabs LegendofzeldacraftTab = new LegendofzeldacraftTab("LegendofzeldacraftTab"); 
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event)
	{
	}
	
	@EventHandler
	public static void postinit(FMLPostInitializationEvent event)
	{
		
	}
	
}