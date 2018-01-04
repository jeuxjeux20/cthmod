package com.dieutourtechonology.cthmod;

import com.dieutourtechonology.cthmod.items.client.render.blocks.BlockRenderRegister;
import com.dieutourtechonology.cthmod.items.client.render.items.ItemRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy  {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        ItemRenderRegister.registerItemRender();
        BlockRenderRegister.registerBlockRenderer();
        // MinecraftForge.EVENT_BUS.register(rotateTools);
    }
        
    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}