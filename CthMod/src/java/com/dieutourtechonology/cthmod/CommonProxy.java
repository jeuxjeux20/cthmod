package com.dieutourtechonology.cthmod;

import com.dieutourtechonology.cthmod.blocks.ModBlocks;
import com.dieutourtechonology.cthmod.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Common proxy for the mod.
 * @see ServerProxy
 * @see ClientProxy
 * @author jeuxjeux20 and cth103
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {
    	ModItems.createItems();
    	ModBlocks.createBlocks();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
