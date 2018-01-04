package com.dieutourtechonology.cthmod.items.client.render.blocks;

import com.dieutourtechonology.cthmod.Main;
import com.dieutourtechonology.cthmod.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	public static void registerBlockRenderer() {
		reg(ModBlocks.cth_block);
	}
	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
				Item.getItemFromBlock(block), 
				0, new ModelResourceLocation(Main.MODID + ":" + block.getUnlocalizedName().substring(5)));
	}
}
