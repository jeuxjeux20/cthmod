package com.dieutourtechonology.cthmod; // dieu tour technology

/// FORGE
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
//////

//Yeah so this is the class
@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
	
	@SidedProxy(clientSide="com.dieutourtechonology.cthmod.ClientProxy", serverSide="com.dieutourtechonology.cthmod.ServerProxy")
	public static CommonProxy proxy;
	
    public static final String MODID = "cthmod";
    public static final String MODNAME = "Best CTH mod tm";
    public static final String VERSION = "1.0.0";

    @Instance
    public static Main instance = new Main();

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
}